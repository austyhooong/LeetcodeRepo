class NumberAndItsDouble {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] * 2 == arr[j]) || (arr[j] * 2 == arr[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}

/*
Time Complexity: O(n^2)
Space Complexity: O(1)

https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
Given an array arr of integers, check if there exist two indices i and j such that :
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]

Example 1:
Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 */