package Math;

public class PalindromeNumber {
    /**
     * Determine whether an integer is a palindrome. Do this without extra space.

     Some hints:
     Could negative integers be palindromes? (ie, -1)
     If you are thinking of converting the integer to string, note the restriction of using extra space.
     You could also try reversing an integer. However, if you have solved the problem "Reverse Integer",
     you know that the reversed integer might overflow. How would you handle such case?
     There is a more generic way of solving this problem.
     */

    public boolean isPalindrome(int x) {
        // corner case
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int result = 0;
        while (x > result){
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result == x || result/10 == x;
    }
}
