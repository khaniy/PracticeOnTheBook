package Chap1;

public class Median3 {
    static int mde3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (c >= a)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }
}
