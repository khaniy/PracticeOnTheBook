package Chap5;

public class EuclidGCD {
    static int gcd(int x, int y){
        if(y==0)
            return x;
        else
            return gcd(y, x%y);

    }

    static int gcdNoRecursive(int x, int y){
        while (y==0){
            int temp = x;
            x = y;
            y = temp % y;
        }
        return x;
    }
}
