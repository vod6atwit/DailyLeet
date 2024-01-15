class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumOfGas = 0;
        int sumOfCost = 0;
        for(int i = 0; i < gas.length; i++) {
            sumOfGas += gas[i];
            sumOfCost += cost[i];
        }

        // if sum of array gas smaller than sum of array cost, return -1 
        // Gas need to be greater than cost to be able to complete the circuit
        if(sumOfGas < sumOfCost){
            return -1;
        }

        int start = 0;
        int curr_fuel = 0;
        for(int i = 0; i < gas.length; i++){
            if(curr_fuel < 0){
                start = i;
                curr_fuel = 0;
            }
            curr_fuel += gas[i] - cost[i];
        }

        return start;
    }
}

// Runtime : 2ms - Beats: 96.34%
// Memory : 55.63MB - Beats: 62.87%
// Link submission: https://leetcode.com/problems/gas-station/submissions/1072708571/