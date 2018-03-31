# Binary Search

## Easy
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