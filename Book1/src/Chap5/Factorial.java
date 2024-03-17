package Chap5;

public class Factorial {
    static int factorial2(int n) {
        if (n > 0)
            return n * factorial2(n - 1);
        else
            return 1;
    }

    static int factorial(int n) {
        return (n > 0) ? n * factorial(n - 1) : 1;
    }

    static int factorialNoRecursive(int x) {
        int ans = 1;
        for (int i = 1; i <= x; i++) {
            ans *= i;
        }
        return ans;
    }
}
