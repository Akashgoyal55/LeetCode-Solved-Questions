class Solution {
    public int reverse(int x) {

        int reversed = 0;

        while(x!=0){

            //get the last digit
            int lastDigit = x % 10;

            //remove the last digit from x
            x = x / 10;

            if(reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }

            if(reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE/ 10 && lastDigit < -8)){
                return 0;
            }

            //add the digit to the reversed number
            reversed = reversed * 10 + lastDigit;


        }
        return reversed;
    }
}