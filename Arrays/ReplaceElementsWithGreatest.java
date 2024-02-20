class ReplaceElementsWithGreatest {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int largest = -1;
        for (int i = length - 1; i >= 0; i--) {
            if (arr[i] > largest) {
                int temp = largest;
                largest = arr[i];
                arr[i] = temp;
            } else {
                arr[i] = largest;
            }
        }
        return arr;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)

https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
Given an array arr, replace every element in that array with the greatest element among the elements to its right,
and replace the last element with -1.
After doing so, return the array.

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
 */