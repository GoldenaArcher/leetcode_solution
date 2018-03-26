package Math;

public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int mod = x % 10;
            int tempVal = result*10 + mod;

            if (((tempVal - mod) / 10) != result)
                return 0;

            result = tempVal;
            x /= 10;
        }
        return result;
    }
}
