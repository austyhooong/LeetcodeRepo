class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int length = nums.length;
        int[] finalArray = new int[length];
        int rightIndex = n;
        int leftIndex = 0;
        int index = 0;

        while (rightIndex < length) {
            finalArray[index] = nums[leftIndex];
            finalArray[index + 1] = nums[rightIndex];

            leftIndex++;
            rightIndex++;
            index += 2;
        }
        return finalArray;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
The output of the function should not be considered towards space complexity; in this case
we are not creating extra space to calculate other than the finalArray which itself is the
output thus space complexity is O(1)

https://leetcode.com/problems/shuffle-the-array/
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */