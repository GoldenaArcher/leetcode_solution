package Array;

public class ContainerWithMostWater {

    /**
     Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
     n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two
     lines, which together with x-axis forms a container, such that the container contains the most water.

     Note: You may not slant the container and n is at least 2.

     Original:
     y
     10                                            |
     9                              |              |
     8          |                   |              |
     7          |                   |              |
     6     |    |              |    |    |         |
     5     |    |         |    |    |    |    |    |
     4     |    |    |    |    |    |    |    |    |
     3     |    |    |    |    |    |    |    |    |    |
     2     |    |    |    |    |    |    |    |    |    |
     1     |    |    |    |    |    |    |    |    |    |
     0     1    2    3    4    5    6    7    8    9    10 ->x

     Step 1:
     y
     10                                            |
     9                              |              |
     8          |                   |              |
     7          |                   |              |
     6     |    |              |    |    |         |
     5     |    |         |    |    |    |    |    |
     4     |    |    |    |    |    |    |    |    |
     3     |    |    |    |    |    |    |    |    |
     2     |    |    |    |    |    |    |    |    |
     1     |    |    |    |    |    |    |    |    |
     0     1    2    3    4    5    6    7    8    9 ->x

     Step 2:
     y
     10                                       |
     9                         |              |
     8     |                   |              |
     7     |                   |              |
     6     |              |    |    |         |
     5     |         |    |    |    |    |    |
     4     |    |    |    |    |    |    |    |
     3     |    |    |    |    |    |    |    |
     2     |    |    |    |    |    |    |    |
     1     |    |    |    |    |    |    |    |
     0     2    3    4    5    6    7    8    9 ->x

     ...
     Keep repeating the process until left meets right

     */

    public int maxArea(int[] height) {
        int area = 0;
        // left and right is the index of the value
        int left = 0, right = height.length-1;

        // set the condition thus when left index meets right index, the method quit execute
        while (left < right){
            // Find the current area by calculating the shorter height of both sides for
            // obvious reason. Then times the height with the width (right - left)
            int currArea = Math.min(height[left], height[right]) * (right - left);
            // update area in order to find the max area
            area = Math.max(area, currArea);

            // the reason is obvious, as the width gets smaller, if the shorter side is
            // kept as the height, the calculation will never reach it's maximum area.
            if (height[left] < height[right]){
                // left needs move toward the right
                left++;
            } else {
                // right needs move toward the left
                right--;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        // tested on leetcode
    }
}
