class Solution {
    public double average(int[] salary) {
        // Arrays.sort(salary); O(nlogn)
        // double sum = 0;
        // for(int i = 1; i < salary.length - 1; i++){ O(n)
        //     sum += salary[i];
        // }
        // return sum / (salary.length - 2);
        // Time Complexity: O(nlogn)
  
        double minSalary = Double.MAX_VALUE;
        double maxSalary = Double.MIN_VALUE;
        double sum = 0;

        for (int s : salary) { //O(N)
            // Sum of all the salaries.
            sum += s;
            // Update the minimum salary.
            minSalary = Math.min(minSalary, s);
            // Update the maximum salary.
            maxSalary = Math.max(maxSalary, s);
        }

        // Divide the sum by total size - 2, as we exclude minimum and maximum values.
        return (sum - minSalary - maxSalary) / (salary.length - 2);
        // Time Complexity O(N)

    }
}