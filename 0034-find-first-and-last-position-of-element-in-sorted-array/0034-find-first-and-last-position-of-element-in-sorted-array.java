class Solution {
    public int[] searchRange(int[] nums, int target) {

        int firstPosition = firstSearch(nums, target);
        int lastPosition = findLast(nums, target);

        return new int[]{firstPosition, lastPosition};

        
    }

    static int firstSearch(int[] nums, int target){

        int start = 0;
        int end = nums.length-1;

        int answer = -1;

        while(start <=end){

            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                answer = mid;
                end = mid-1;
            }else if(nums[mid] < target){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return answer;
    }

    private int findLast(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int answer = -1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (nums[middle] == target) {

                // Store the current matching index
                answer = middle;

                // Continue searching on the right side
                left = middle + 1;

            } else if (nums[middle] < target) {

                left = middle + 1;

            } else {

                right = middle - 1;
            }
        }

        return answer;
    }
}