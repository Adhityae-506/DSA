// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M..

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// // M             1000


// Example 1:

// Input: s = "III"
// Output: 3
// Explanation: III = 3.
// Example 2:

// Input: s = "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3.
// Example 3:

// Input: s = "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        int result = 0;

        for(int i=0;i<s.length()-1;i++)
        {
            int currentValue = roman.get(s.charAt(i));
            int nextValue = roman.get(s.charAt(i + 1));

            if(currentValue < nextValue){
                result -= currentValue;
            }
            else{
                result += currentValue;
            }
        }
        result += roman.get(s.charAt(s.length() - 1));

        return result;
        
        
    }
}

