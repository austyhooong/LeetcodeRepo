import java.util.Arrays;

class WidestVerticalArea {
    public int maxWidthOfVerticalArea(int[][] points) {
        int length = points.length;
        int widestVertical = 0;
        int[] oneDimensionalArray = new int[points.length];

        for (int i = 0; i < length; i++) {
            oneDimensionalArray[i] = points[i][0];
        }

        Arrays.sort(oneDimensionalArray);

        for (int i = 0; i < length - 1; i++) {
            if (widestVertical < (oneDimensionalArray[i + 1] - oneDimensionalArray[i])) {
                widestVertical = oneDimensionalArray[i + 1] - oneDimensionalArray[i];
            }
        }
        return widestVertical;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)

https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
Given n points on a 2D plane where points[i] = [xi, yi], Return the widest vertical area
between two points such that no points are inside the area.
A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height).
The widest vertical area is the one with the maximum width.
Note that points on the edge of a vertical area are not considered included in the area.

Example 1
Input: points = [[8,7],[9,9],[7,4],[9,7]]
Output: 1
Explanation: Both the red and the blue area are optimal.
 */