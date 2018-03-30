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
### 8. 
*Method used to solve this problem*: loop.

*Idea*:

        Thd problem is fairly simple, the only thing needs to worry about is the boundry case. In this problem,
    the boundry case is when the string is empty and/or the string exceeds the limit of int.
        First of all, trim the string in order to remove any leading and trending digit. Then check the size of
    of the string to prevent empty string since charAt(0) is used to get +/- sign, this step is necessary to 
    prevent NullPointerException. If the string exceeds the size of integer limit, in this case, the variable's
    data type is long, based on the sign and return Integer.Max/Min.