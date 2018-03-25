# Array

## Easy
### 1. Two Sum
*Method used to solve this problem*: HashMap.

*Idea*:
    
    Using HashMap<Integer, Integer> to solve the problem.
    The 1st Integer is the current value in the array, and the 2nd Integer is the index of current value.
    Each time before adding new index key into the HashMap, 1st to check if the complementary of the result and current value is in the HashMap already. If so, then the method can directly return 2 indexes as result.
    Further explained:
        Given nums = [2, 7, 11, 15], target = 9.
        index 0: the 1st pair of value stored in HashMap will be (2, 0).
        index 1: the complementary number is 2(target(9) - current value(7)). As the complementary number has already been stored in the HashMap, it can directly return [0, 1] as its result.
        
    The Time Complexity for this problem is: O(n).
        The search in HashMap is O(1), and in the worst case, the function loops through all nth element, then return found pair or invalid pair(edge case).
    The Space Complexity for this problem is: O(n).
        In the worst case, nth items have been stored in the HashMap.
     
### 26. Remove Duplicates from Sorted Array
*Method used to solve this problem*: Two Pointers.

*Idea*:
