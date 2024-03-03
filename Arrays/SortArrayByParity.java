class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int leftIndex = 0;

        for (int rightIndex = 0; rightIndex < nums.length; rightIndex++) {
            if ((nums[rightIndex] % 2) == 0) {
                int previousLeftmostValue = nums[rightIndex];
                nums[rightIndex] = nums[leftIndex];
                nums[leftIndex] = previousLeftmostValue;
                leftIndex++;
            }
        }
        return nums;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)

https://leetcode.com/problems/sort-array-by-parity/
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */