class Solution {
    public String stringShift(String s, int[][] shift) {
        // char[] char_arr = new char[s.length()];
        // for(int[] arr : shift){
        //     int sign = arr[0] == 0 ? -1 : 1;
        //     int amount = arr[1] * sign;
        //     int i = 0;
        //     while(i < s.length()){      
        //         int new_index = (amount + i) % s.length();
        //         if(new_index < 0){
        //             new_index += s.length();
        //         }
        //         char c = s.charAt(i);
        //         char_arr[new_index] = c;
        //         i++;
        //     }
        //     s = new String(char_arr);

        // }
        for(int[] arr : shift){
            int direction = arr[0];
            int amount = arr[1] % s.length();

            if(direction == 0){
                s = s.substring(amount) + s.substring(0, amount);
            }else{
                s = s.substring(s.length() - amount) + s.substring(0, s.length() - amount)
;            }
        }


        return s;
    }
}

// -1+0 = -1 % length = 2
// -1+1 = 0 % length = 0
// -1+2 = 1 % length = 1
// abc
// 012

// bca
// 012


// 2 + 0 = 2 % length = 2
// 2 + 1 = 3 % length = 0
// 2 + 2 = 4 % length = 1
// cab
// 012