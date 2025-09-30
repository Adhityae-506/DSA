// Example 1:

// Input: salary = [4000,3000,1000,2000]
// Output: 2500.00000
// Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
// Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
// Example 2:

// Input: salary = [1000,2000,3000]
// Output: 2000.00000
// Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
// Average salary excluding minimum and maximum salary is (2000) / 1 = 2000

class Solution {
    public double average(int[] salary) {
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        int max = salary[0];
        int min = salary[0];

        for(int i=0;i<salary.length;i++){
            if(salary[i] < min){
                min = salary[i];
            }
            if(salary[i] > max){
                max = salary[i];
            }
        }
        
        int sum = 0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]==max || salary[i]==min){
                continue;
            }
            sum += salary[i];
        }
        double average = (double) sum / (salary.length - 2);
        return average;
        
    }
}
