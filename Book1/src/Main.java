import Chap2.ArrayFunction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5];
        ArrayFunction.copyReverse(a,b);
        System.out.println(ArrayFunction.sumOf(a));
        System.out.println(Arrays.toString(b));
    }


}