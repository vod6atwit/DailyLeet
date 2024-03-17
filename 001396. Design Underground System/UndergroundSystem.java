class UndergroundSystem {
    Map<Integer, Map<String, Integer>> data;
    Map<Map<String, String>, List<Integer>> averageTime;

    public UndergroundSystem() {
        data = new HashMap<>();
        averageTime = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        Map<String, Integer> station_time = new HashMap<>();
        station_time.put(stationName, t);
        data.put(id, station_time);
    }

    public void checkOut(int id, String stationName, int t) {
        String startStation = "";
        int startTime = 0;
        Map<String, Integer> station_time = new HashMap<>();
        Map<String, String> trip = new HashMap<>();

        station_time = data.get(id);

        for (Map.Entry<String, Integer> entry : station_time.entrySet()) {
            startStation = entry.getKey();
            startTime = entry.getValue();
        }

        int totalTime = t - startTime;
        trip.put(startStation, stationName);

        List<Integer> time = new ArrayList<>();

        if (averageTime.containsKey(trip)) {
            time = averageTime.get(trip);
        }
        time.add(totalTime);
        averageTime.put(trip, time);
        data.remove(id, station_time);

    }

    public double getAverageTime(String startStation, String endStation) {
        double result = 0;
        Map<String, String> trip = new HashMap<>();
        List<Integer> time = new ArrayList<>();

        trip.put(startStation, endStation);

        time = averageTime.get(trip);
        for(int num : time){
            result += num;
        }
        return result/time.size();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */