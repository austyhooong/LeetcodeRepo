class SquaredSortedArray_BetterSolution {
    public int[] sortedSquares(int[] nums) {
        int[] finalArray = new int[nums.length];
        int positiveIndex = 0;
        int negativeIndex = 0;
        int finalArrayIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((i == nums.length - 1) && (nums[i] < 0)) {
                negativeIndex = i;
                break;
            }
            if (nums[i] < 0 && nums[i + 1] >= 0) {
                negativeIndex = i;
                break;
            }
        }
        if (negativeIndex != nums.length - 1) {
            positiveIndex = negativeIndex + 1;
        }

        while(negativeIndex >= 0 && positiveIndex <= nums.length - 1) {
            if(Math.pow(nums[negativeIndex], 2) > Math.pow(nums[positiveIndex], 2)) {
                finalArray[finalArrayIndex] = (int)Math.pow(nums[positiveIndex], 2);
                positiveIndex++;
            } else {
                finalArray[finalArrayIndex] = (int)Math.pow(nums[negativeIndex], 2);
                negativeIndex--;
            }
            finalArrayIndex++;
        }
        while(finalArrayIndex < nums.length && negativeIndex >= 0) {
            finalArray[finalArrayIndex] = (int)Math.pow(nums[negativeIndex], 2);
            finalArrayIndex++;
            negativeIndex--;
        }

        while(finalArrayIndex < nums.length && positiveIndex <= nums.length - 1) {
            finalArray[finalArrayIndex] = (int)Math.pow(nums[positiveIndex], 2);
            finalArrayIndex++;
            positiveIndex++;
        }

        return finalArray;
    }
}

// Time Complexity: O(nlogn)
// Space Complexity: O(1)

/*
https://leetcode.com/problems/squares-of-a-sorted-array/description/
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
 */