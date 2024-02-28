class RemoveZeroes {
    public void moveZeroes(int[] nums) {
        int leftIndex = 0;

        for (int rightIndex = 0; r < nums.length; rightIndex++) {
            if (nums[r] != 0) {
                int previousLeftMostValue = nums[rightIndex];
                nums[rightIndex] = nums[leftIndex];
                nums[leftIndex] = previousLeftMostValue;
                leftIndex++;
            }
        }
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)

https://leetcode.com/problems/move-zeroes/

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 */