package powerpackage;

public class powerfinder {
    public static int power(int base, int exponent) {
        int res = 1;
        for (int i = 0; i<exponent; i++) {
            res *= base;
        }
        return res;
    }
}
