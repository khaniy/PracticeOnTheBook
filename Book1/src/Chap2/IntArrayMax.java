package Chap2;

public class IntArrayMax {
    static int max(int[] a){
        int max = a[0];
        for (int i=0; i<a.length; i++){
            if(max<a[i])
                max = a[i];
        }
        return 1;
    }
}
