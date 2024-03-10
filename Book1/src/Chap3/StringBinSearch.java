package Chap3;

import java.util.Arrays;
import java.util.Comparator;


public class StringBinSearch {
    private static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

    private static class HeightOrderComparator implements Comparator<PhyscData> {
        public int compare(PhyscData d1, PhyscData d2) {
            return (d1.height > d2.height) ? 1 :
                    (d1.height < d2.height) ? -1 : 0;
        }
    }

    public static int stringBinSearch(PhyscData[] dat, int key){
        int idx = Arrays.binarySearch(dat, new PhyscData("", key, 0.0),
                HEIGHT_ORDER);
        return idx;
    }




}
