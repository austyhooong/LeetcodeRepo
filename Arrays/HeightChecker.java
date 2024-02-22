import java.util.Arrays;

public class HeightChecker {

    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);

        int misplacedElements = 0;

        // selection sort the expected array
        int length = expected.length;
        for (int i = 0; i < length; i++) {
            int min = expected[i];
            int indexOfMin = i;

            for (int j = i + 1; j < length; j++) {
                if (expected[j] < min) {
                    min = expected[j];
                    indexOfMin = j;
                }
            }

            int temp = expected[indexOfMin];
            expected[indexOfMin] = expected[i];
            expected[i] = temp;
        }

        // compare expected and heights and increase misplacedElements by one every time there is an inconsistency
        for (int i = 0; i < length; i++) {
            if (expected[i] != heights[i]) {
                misplacedElements++;
            }
        }

        return misplacedElements;
    }
}

/*
Time Complexity: O(n^2)?
Space Complexity: O(n)

https://leetcode.com/problems/height-checker/description/
A school is trying to take an annual photo of all the students.
The students are asked to stand in a single file line in non-decreasing order by height.
Let this ordering be represented by the integer array expected
where expected[i] is the expected height of the ith student in line.
You are given an integer array heights representing the current order that the students are standing in.
Each heights[i] is the height of the ith student in line (0-indexed).
Return the number of indices where heights[i] != expected[i].

Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation:
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
 */