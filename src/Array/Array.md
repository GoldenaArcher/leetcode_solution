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
     
### 27. Remove Element
*Method used to solve this problem*: Two Pointers.

*Idea*:

        The idea of this problem is similar to #26 Remove Duplicates from Sorted Array. It is the same
    approach.
    
### 35. Search Insert Position
*Method used to solve this problem*: Binary Search.

*Idea*:

        First time I used loop to solve this problem (time complexity O(n)), but the time is about 
    50%-60% of the average speed and was not ideal. Once I clicked on the related topics, there is 
    binary search, and it is obvious the question can be solved by using binary search (time 
    complexity O(log(n)).
        For binary search, as the question stated that the array will be sorted, so the condition is 
    set as (low <= high), as if using (low < high), it will return wrong index. Once the middle number
    is identified, check the value is smaller or larger, then update low or high.
        It is important to return mid directly if mid == target, otherwise it will still take 6ms 
    rather than 5 ms.
    
### 53. Maximum Subarray
*Method used to solve this problem*: Divide and Conquer, Dynamic Programming.

*Idea*:

        The idea is to use dynamic programming to solve this problem, and 2 variables needs to be used
    in this case. One is to store local maximum or the current count, and the other is used as the 
    maximum number overall. 
        Taken [-2,1,-3,4,-1,2,1,-5,4] as an example.
        When the index is at 0, the local and global max value is -2. 
        When the index is at 1, by comparing (-2 + 1) and 1, the local and global max value is 1.
        When the index is at 2, by comparing (1 + -3) and -3, the local max is -2, but the global max 
    stays at 1.
        ...
        The process is repeated until finishing and comparing the whole array. Thus the time complexity
    is O(n), and the space complexity is o(1).
        
### 118. Pascal's Triangle
*Method used to solve this problem*: Brute Force.

*Idea*:

        First to create a list of list for the return result, then create a list to hold the value of 
    each line, then loop through the given number. In the loop, each time append number 1 to index 0.
    In a second loop, loop from 1 to row's size -1, as the 1st and last value of each row is always 1.
        Taken 5 as an example.
        Index 0:
          [1], as it doesn't enter to 2nd loop.
        Index 1:
          [1, 1], as it doesn't enter to 2nd loop neither.
        Index 3:
          [1, 1, 1] after 1st append.
            As entering the 2nd loop, the current value is updated with the sum of current value and
          next.
          [1, 2(1+1), 1]
        Index 4:
          [1, 1, 2, 1] after 1st append.
          [1, 3, 3, 1] after 2nd loop.
        
        It is important that when add the current row to the return result, always create a new 
    ArrayList as the pointer will point to the same value, thus creat the same line each time. Also, not
    the value before the current index(2nd loop), but the next value as the previous value will be 
    updated.
        Time complexity is O(n²) as there is 1 nested loop. Space complexity is O(n²) as the space of 
    triangle is n×n/2 which is still n².

    
### 283. Move Zeroes
*Method used to solve this problem*: Two Pointers.

*Idea*:

        The approach of current issue is similar to 27. Remove Element and # 26. Remove Duplicates from
    Sorted Array. Originally I used two loops, it is still O(n) as O(2n) is same as O(n), but it was only
    sub-optimal. The more optimal method is to swap two values with different pointers in the array if 
    the current values != 0.

## Medium
### 11. Container With Most Water
*Method used to solve this problem*: Two Pointers.

*Idea*:

        The problem's related topics are Array and Two Pointers, so using Two Pointers seems to be the
    solution for this problem.
        The brute force to solve this problem is to loop through all the posiible combination of both 
    index(n and ai) to find the maximum. However, the time complexity for this will be O(n²).
        The other approach is to use Two Pointers, which loops the entire array only once thus the time
    complexity is O(n).
        Here are diagrams to help understanding the problem. The x-axis is the length of the array, and
    the value of y-axis is the correspond value in the array with given index(x).
        In order to find the max area, the original left value is set at index 0(correspondingly the 1st
    value, y=1), and the right is set at index 9(correspondingly the last value, y = 10). As the hight
    of the area is bounded by the minimum value between left and right, there is no point to keep the
    smaller value in the equation as the width only gets smaller and smaller. Thus, from original to step
    1, the pointer right moves toward left and calculates the new area.
        
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
              left                                         right
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
         
         Keep repeating the process until left meets right. At this point, the whole array has been looped
     once. Exchanging the index will only results in repeaded value.
         The Space Complexity for this problem is O(1) as only larger value of calculated area and current 
     value is kept. 
     
 