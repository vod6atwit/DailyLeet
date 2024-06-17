class MovingAverage {
    private Queue<Integer> queue = new ArrayDeque<>();;
    private int size;
    private int sum = 0;

    public MovingAverage(int size) {
        this.size = size;
    }
    
    public double next(int val) {
        queue.add(val);
        int first = queue.size() > size ? queue.remove() : 0;
        sum += val - first;

        return sum/(double)queue.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */