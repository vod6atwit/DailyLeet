class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        int last_timestamp = -1;

        for (String l : logs) {
            String[] log = l.split(":");
            int function_id = Integer.parseInt(log[0]);
            boolean isStart = "start".equals(log[1]);
            int timestamp = Integer.parseInt(log[2]);

            // ex: if funtion 1 starts at 2 and ends at 5,
            // that means the timestamp = 6 - 2 = 4 (including 5)
            if (!isStart)
                timestamp += 1;

            // if there is a function in stack
            // get the current function and plus its timestamp with the current timestamp -
            // last_timestamp
            if (!stack.isEmpty()) {

                int id = stack.peek();
                result[id] += timestamp - last_timestamp;
            }

            // if current thread is running, add to stack
            // if not, remove it from stack
            if (isStart) {
                stack.push(function_id);
            } else {
                stack.pop();
            }

            // set new timestamp
            last_timestamp = timestamp;
        }

        return result;
    }
}