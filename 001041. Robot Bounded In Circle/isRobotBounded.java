class Solution {
    public boolean isRobotBounded(String instructions) {
        int x = 0;
        int y = 0;
        int x_direction = 0;
        int y_direction = 1;

        for(int i = 0; i < instructions.length(); i++){
            char c = instructions.charAt(i);

            if(c == 'G'){
                x += x_direction;
                y += y_direction;
            }else if(c == 'L'){
                int temp = x_direction;
                x_direction = y_direction;
                y_direction = -1 * temp;
            }else{
                int temp = x_direction;
                x_direction = -1 * y_direction;
                y_direction = temp;
            }
        }

        return (x == 0 && y == 0) || x_direction != 0 || y_direction != 1;
    }
}