// Example 1:

// Input: num1 = "2", num2 = "3"
// Output: "6"
// Example 2:

// Input: num1 = "123", num2 = "456"
// Output: "56088"

class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";

        int len1 = num1.length();
        int len2 = num2.length();

        int[] result = new int[len1 + len2];

        for(int i=len1 - 1;i>=0;i--){
            int digit1 = num1.charAt(i) - '0';
            for(int j=len2 - 1;j>=0;j--){
                int digit2 = num2.charAt(j) - '0';
                int sum = digit1 * digit2 + result[i + j + 1];

                result[i+j+1] = sum%10;
                result[i+j] += sum/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i < result.length && result[i]==0) i++;
        while(i < result.length) sb.append(result[i++]);

        return sb.toString();
    }
}