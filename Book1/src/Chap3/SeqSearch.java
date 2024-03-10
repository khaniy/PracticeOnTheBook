package Chap3;

public class SeqSearch {
    static int seqSearch(int[] dat, int n, int key){
        int i=0;
        while (true){
            if(i==n)
                return -1;
            if(dat[i] == key)
                return 1;
            i++;
        }
    }
}
