class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){

            char c = s.charAt(i);

            if((c>='a' && c<='z') ||
                (c>='A' && c<='Z') ||
                (c>='0' && c<='9')){
                    sb.append(c);
                }
        }

        String str = sb.toString().toLowerCase();

        int start  = 0;
        int end = str.length()-1;

        while(start < end){

            if(str.charAt(start) != str.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
        
    }
}