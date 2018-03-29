package Math;

public class StringToInteger {

    /**
     Implement atoi to convert a string to an integer.
     Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below
     and ask yourself what are the possible input cases.
     Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are
     responsible to gather all the input requirements up front.



     Requirements for atoi:
     The function first discards as many whitespace characters as necessary until the first non-whitespace
     character is found. Then, starting from this character, takes an optional initial plus or minus sign
     followed by as many numerical digits as possible, and interprets them as a numerical value.

     The string can contain additional characters after those that form the integral number, which are ignored
     and have no effect on the behavior of this function.

     If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such
     sequence exists because either str is empty or it contains only whitespace characters, no conversion is
     performed.

     If no valid conversion could be performed, a zero value is returned. If the correct value is out of the
     range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
     */

    public static int myAtoi(String str) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        str = str.trim(); // remove extra space

        if (str.length() == 0 || str == null){
            return 0;
        }

        char firstChar = str.charAt(0);
        int sign = 1, index = 0;
        long result = 0;

        if (firstChar == '+' || firstChar == '-'){
            sign = (firstChar == '+') ? 1 : -1;
            index++;
        } else if (!(Character.isDigit(firstChar)))
            return 0;

        for (int i = index; i < str.length(); i++) {
            if (!(Character.isDigit(str.charAt(i)))){
                return (int) result * sign;
            }
            result = result * 10 + str.charAt(i) - '0';

            if (result > max && sign == 1)
                return max;
            if (result > max && sign == -1)
                return min;
        }
        return (int)result * sign;
    }

    public static void main(String[] args) {
        int val = myAtoi("");
        System.out.println(val);
    }
}
