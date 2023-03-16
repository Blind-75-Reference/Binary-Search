class Solution {
    public int search(int[] nums, int target) {
        int leftBoundary = 0;
        int rightBoundary = nums.length-1;

        while(leftBoundary <= rightBoundary) {
            int mid = (rightBoundary - leftBoundary) / 2 + leftBoundary;
            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                //target is left of mid
                rightBoundary = mid-1;
            } else {
                //target is right of mid
                leftBoundary = mid+1;
            }
        }
        return -1;
    }
}