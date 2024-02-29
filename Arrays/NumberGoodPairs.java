class NumberGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int goodPairCounter = 0;
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] == nums[j]) {
                    goodPairCounter++;
                }
            }
        }
        return goodPairCounter;
    }
}

/*
Time complexity: O(n^2)
Space complexity: O(1)

https://leetcode.com/problems/number-of-good-pairs/
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */