package Chap2;

import java.util.ArrayList;

public class PrimeNumber {
    public static Object[] prime(int x) {
        int ptr = 0;
        ArrayList<Integer> storage = new ArrayList<Integer>();

        for (int i = 0; i < x; i++) {
            if(isPrimeNumber(i))
                storage.add(i);
        }
        return storage.toArray();

    }

    private static boolean isPrimeNumber(int input) {
        ArrayList<Integer> storage = new ArrayList<>();
        for (int i = 1; i < input; i++) {
            if (input % i == 0)
                storage.add(i);
        }
        return storage.toArray().length == 2;

    }
}
