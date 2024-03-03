class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> end_meeting = new PriorityQueue<>();
        end_meeting.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            int room_available_at = end_meeting.peek();
            int start_time = intervals[i][0];
            int end_time = intervals[i][1];
            if (room_available_at <= start_time) {
                // make 1 room available
                end_meeting.poll();
            }
            // always schedule room for meeting
            end_meeting.add(end_time);
        }

        return end_meeting.size();
    }
}