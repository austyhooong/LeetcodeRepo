class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int length = nums.length;
        int[] finalArray = new int[length];
        int rightPointer = n;
        int leftPointer = 0;
        int index = 0;

        while (rightPointer < length) {
            finalArray[index] = nums[leftPointer];
            finalArray[index + 1] = nums[rightPointer];

            leftPointer++;
            rightPointer++;
            index += 2;
        }
        return finalArray;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)

https://leetcode.com/problems/shuffle-the-array/
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */