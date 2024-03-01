class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count_5 = 0;
        int count_10 = 0;
        for(int bill : bills){
            if(bill == 5){
                count_5++;
            }else if(count_5 > 0 && bill == 10){
                count_5--;
                count_10++;
            }else if(bill == 20){
                if (count_10 > 0 && count_5 > 0){
                    count_10--;
                    count_5--;
                }else if(count_5 >= 3){
                    count_5 -= 3;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}