# Dynamic Programming

## Easy

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