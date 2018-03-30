package Math;

public class PalindromeNumber {
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
