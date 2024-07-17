class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int res = 0;
        int left = 0;
        int count = 0;
        int totalGrumpyMins = 0;
        int maxTotalGrumpyMins = 0;

        for(int i = 0; i < customers.length; i++){
            if(grumpy[i] == 0){
                res += customers[i];
            }
        }

        for(int right = 0; right < grumpy.length; right++){
            while(count == minutes){
                if(grumpy[left] == 1){
                    totalGrumpyMins -= customers[left];
                }
                left++;
                count--;
            }
            if(grumpy[right] == 1){
                totalGrumpyMins += customers[right];
            }
            maxTotalGrumpyMins = Math.max(totalGrumpyMins, maxTotalGrumpyMins);
            count++;
        }

        return res + maxTotalGrumpyMins;
    }
}