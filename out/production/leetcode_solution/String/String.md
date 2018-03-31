# String

## Medium
### 8. String to Integer (atoi)
*Method used to solve this problem*: loop.

*Idea*:

        Thd problem is fairly simple, the only thing needs to worry about is the boundry case. In this problem,
    the boundry case is when the string is empty and/or the string exceeds the limit of int.
        First of all, trim the string in order to remove any leading and trending digit. Then check the size
    of the string to prevent empty string since charAt(0) is used to get +/- sign, this step is necessary to 
    prevent NullPointerException. If the string exceeds the size of integer limit, in this case, the variable's
    data type is long, based on the sign and return Integer.Max/Min.