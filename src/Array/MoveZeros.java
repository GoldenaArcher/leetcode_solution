package Array;

public class MoveZeros {
    /**
     Given an array nums, write a function to move all 0's to the end of it while maintaining the relative
     order of the non-zero elements.
     For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

     Note:
     You must do this in-place without making a copy of the array.
     Minimize the total number of operations.
     Credits:
     Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
     */

    public void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums == null)
            return;

        /**
         *
         * This solution is sub-optimal
         *
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length){
            nums[index++] = 0;
        }
         **/

        // by swapping 2 values, it runs with O(n) rather than O(n+n), though the latter is still O(n)
        // but current method is more optimal

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                int temp = nums[index];
                nums[index++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
