package HashTable;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    /**
     Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     You may assume that each input would have exactly one solution, and you may not use the same element twice.

     Example:
     Given nums = [2, 7, 11, 15], target = 9,
     Because nums[0] + nums[1] = 2 + 7 = 9,
     return [0, 1].
     */
    public int[] twoSum(int[] nums, int target) {
        // edge case: if nums.length < 2
        if (nums.length < 2)
            return new int[]{-1,-1};

        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // get the complementary number
            int comp = target - nums[i];
            // if the HashMap has already contains the complementary key, then return the index of
            // complementary number and the current index
            if (result.containsKey(comp)){
                return new int[]{result.get(comp), i};
            }
            // else just keep putting the already appeared number and its index into HashMap
            result.put(nums[i], i);
        }
        // another edge case, if there is no result whatsoever
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};
        int[] result = twoSum.twoSum(nums, 9);
        System.out.println(Arrays.toString(result));
    }
}
