# TwoPointers

## Easy
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
