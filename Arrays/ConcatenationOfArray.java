class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] finalArr = new int[length * 2];

        for (int i = 0; i < length; i++) {
            finalArr[i] = nums[i];
            finalArr[i + length] = nums[i];
        }
        return finalArr;

    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)

https://leetcode.com/problems/concatenation-of-array/
Given an integer array nums of length n, you want to create an array ans of length 2n
where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.

Example 1:
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
 */