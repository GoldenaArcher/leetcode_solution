package Array;

public class RemoveDuplicatesfromSortedArray {
    /**
     Given a sorted array, remove the duplicates in-place such that each element appear only once and
     return the new length.

     Do not allocate extra space for another array, you must do this by modifying the input array
     in-place with O(1) extra memory.

     Example:
     Given nums = [1,1,2],
     Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
     It doesn't matter what you leave beyond the new length.
     */

    /*
    [1, 1, 2]
     j  i

     */

    public int removeDuplicates(int[] nums) {
        // prevent NullPointer error
        if (nums.length == 0)
            return 0;

        // declare the variable outside the loop for return value
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        // return the length of the array, which starts at 1 rather than 0. Thus add 1
        return j+1;
    }

    public static void main(String[] args) {
    }
}
