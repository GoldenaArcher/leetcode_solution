# Array

## Easy
### 1. Two Sum
*Method used to solve this problem*: HashMap.

*Idea*:

        Using HashMap<Integer, Integer> to solve the problem.
        The 1st Integer is the current value in the array, and the 2nd Integer is the index of current value.
        Each time before adding new index key into the HashMap, 1st to check if the complementary of the 
    result and current value is in the HashMap already. If so, then the method can directly return 2 indexes
    as result.
        For Example:
            Given nums = [2, 7, 11, 15], target = 9.
            index 0: the 1st pair of value stored in HashMap will be (2, 0).
            index 1: the complementary number is 2(target(9) - current value(7)). As the complementary number 
        has already been stored in the HashMap, it can directly return [0, 1] as its result.
        
        The Time Complexity for this problem is: O(n).
                The search in HashMap is O(1), and in the worst case, the function loops through all nth 
            element, then return found pair or invalid pair(edge case).
        The Space Complexity for this problem is: O(n).
                In the worst case, nth items have been stored in the HashMap.
     
### 26. Remove Duplicates from Sorted Array
*Method used to solve this problem*: Two Pointers.

*Idea*:

        Using 2 pointers can easily solve this problem. As described in the problem, "the input array must be
    modified with O(1) extra memory", which indicates no new array is created. As the requirement states that
    only the length of the new array is returned, and what leave beyond the new length is not relavent, thus 
    modify the original array and return the length is the plan to solve the problem.
        For Example:
            Given nums = [1, 1, 2, 2, 3, 4, 5].
            Set one variable as the index of the modified array, and use fori loop(i starts with 1 as the first
        element is never repeated).
            The condition: if (nums[i] != nums[j]){...}
            When i = 2, the value is 1. Since it does not meet the condition, it passed the for loop.
            When i = 3, it meets the condition, thus j increment 1, and replace the nums[j] to the non-repeated
        value. The new array is now nums = [1, 2, 2, 2, 3, 4, 5].
            When i = 4, the value repeats num[j].
            When i = 5, it meets the condition, and process repeated.
            ...
            Finally, the modified array nums = [1, 2, 3, 4, 5, 4, 5], and the length of the modified non-
        repeated array is j+1 = 5 (the actual length starts with 1 rather than 0).
     

## Medium
### 11. Container With Most Water
*Method used to solve this problem*: Two Pointers.

*Idea*:

        The problem's related topics are Array and Two Pointers, so using Two Pointers seems to be the
    solution for this problem.