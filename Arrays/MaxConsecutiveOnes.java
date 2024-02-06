class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutives = 0;
        int consecutiveOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consecutiveOnes++;
            }
            if(nums[i] == 0) {
                consecutiveOnes = 0;
            }
            maxConsecutives = Math.max(maxConsecutives, consecutiveOnes);
        }
        return maxConsecutives;
    }
}
// Time complexity: O(n)
// Space complexity: O(1)

/*
Had to look up a solution for this one, unfortunately
Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 */