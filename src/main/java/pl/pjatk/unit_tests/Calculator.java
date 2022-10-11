package pl.pjatk.unit_tests;

public class Calculator {

    public static int power(int a, int b) {
       int c = 1;
        for (int i = 1; i <= b; i++) {
            c *= a;
        }
        return c;
    }

    public static boolean divisible(int a, int b) {
        return a % b == 0;
    }

    public static int NWD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return NWD(b, a % b);
    }

    public int multiply(int a, int b) {
        int result = 0;
        if (b < 0) {
            a *= -1;
            b *= -1;
        }
        for (int i = 1; i <= b; i++) {
                result += a;
        }
        return result;
    }

}
