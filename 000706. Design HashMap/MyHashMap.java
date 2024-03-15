class MyHashMap {

    List<int[]> map;

    public MyHashMap() {
        this.map = new ArrayList<>();
    }

    public void put(int key, int value) {
        boolean flag = false;
        for (int[] arr : this.map) {
            if (arr[0] == key) {
                flag = true;
            }
            if (flag) {
                arr[1] = value;
                break;
            }
        }
    
        if (!flag) {
            int[] pair = new int[] { key, value };
            this.map.add(pair);
        }
    }

    public int get(int key) {
        for (int[] arr : this.map) {
            if (arr[0] == key) {
                return arr[1];
            }
        }
        return -1;
    }

    public void remove(int key) {
        for(int i = 0; i < this.map.size(); i++){
            int val = this.map.get(i)[0];
            if(val == key){
                this.map.remove(i);
                break;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */