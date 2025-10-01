// Example 1:

// Input: bills = [5,5,5,10,20]
// Output: true
// Explanation: 
// From the first 3 customers, we collect three $5 bills in order.
// From the fourth customer, we collect a $10 bill and give back a $5.
// From the fifth customer, we give a $10 bill and a $5 bill.
// Since all customers got correct change, we output true.
// Example 2:

// Input: bills = [5,5,10,10,20]
// Output: false
// Explanation: 
// From the first two customers in order, we collect two $5 bills.
// For the next two customers in order, we collect a $10 bill and give back a $5 bill.
// For the last customer, we can not give the change of $15 back because we only have two $10 bills.
// Since not every customer received the correct change, the answer is false.

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5 = 0;
        int count10 = 0;
        int count20 = 0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                count5++;
            }else if(bills[i]==10){
                if(count5!=0){
                    count5--;
                    count10++;
                }
                else{
                    return false;
                }
            }else if(bills[i]==20){
                if(count5!=0 && count10!=0){
                    count5--;
                    count10--;
                }else if(count5>=3){
                    count5-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
