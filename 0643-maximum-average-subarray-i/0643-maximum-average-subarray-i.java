class Solution {
    public double findMaxAverage(int[] nums, int k) {

        //given arr, k, thinking of sliding window

        double sum = 0;

        double maxSum = Double.NEGATIVE_INFINITY;

        int start = 0;
        int end = 0;

        while(end < nums.length){

            sum = sum + nums[end];

            if(end - start + 1 == k){

                maxSum = Math.max(maxSum, sum);

                sum = sum - nums[start];
                start++;
            }
            end++;
        }
        return maxSum / k;

        
        
    }
}