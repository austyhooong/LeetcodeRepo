class EvenNumberDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digits = 0;
            while (nums[i] > 0) {
                nums[i] /= 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

// Time complexity: O(n)
// Space complexity: O(1)

/*
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2
 */