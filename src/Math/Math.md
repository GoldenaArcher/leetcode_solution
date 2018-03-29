# Math

## Easy
### 7. Reverse Integer
*Method used to solve this problem*: module + loop.

*Idea*:

        The problem is fairly simple.
        Given example: 123. 123 % 10 = 3; 12 % 10 = 2; 1 % 10 = 1. It is obvious that the only case needs to be
    worried here is the edge case: Integer overflow.
        In order to prevent such issue, a temperory variable is created, and then test if the temp(value - mod)
    divided by 10 is equal to the result. If so, keep processing until the original value(or the copy of it)
    runs to 0. Otherwise, return an invalid value as the integer has overflown.


### 9. Palindrome Number

## Medium
