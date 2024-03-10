package Chap3;

import java.util.Arrays;

public class BinSearch {
    static int binSearch(int[] dat, int n, int key) {
        int pl = 0;
        int pr = n - 1;
        do {
            int loc = (pl + pr) / 2;
            if (dat[loc] == key)
                return loc;
            else if (dat[loc] > key)
                pl = loc - 1;
            else if (dat[loc] < key)
                pr = loc + 1;
        } while (pl <= pr);
        return -1;

    }
    static int binSearchJavaUtilArrays(int[] dat, int key){
        int loc = Arrays.binarySearch(dat, key);
        return loc;
    }
}
