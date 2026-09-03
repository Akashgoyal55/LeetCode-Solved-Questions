class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {

        int a = s1.length();
        int b = s2.length();

        if(a + b != s3.length()){
            return false;
        }

        boolean[][] dp = new boolean[a+1][b+1];

        dp[0][0] = true;

        for(int i=0; i<=a; i++){
            for(int j=0; j<=b; j++){

                if(i>0 && s1.charAt(i-1) == s3.charAt(i+j-1) && dp[i-1][j]){
                    dp[i][j] = true;
                }

                if(j>0 && s2.charAt(j-1) == s3.charAt(i+j-1) && dp[i][j-1]){
                    dp[i][j] = true;
                }
            }
        }
        return dp[a][b];
        
    }
}