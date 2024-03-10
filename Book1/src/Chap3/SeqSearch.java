package Chap3;

public class SeqSearch {
    static int seqSearch(int[] dat, int n, int key){
        int i=0;
        while (true){
            if(i==n)
                return -1;
            if(dat[i] == key)
                return i;
            i++;
        }
    }

    static int seqSearch2(int[] dat, int n, int key){
        for (int i=0; i<dat.length; i++){
            if(dat[i] == key){
                return i;
            }
        }
        return -1;
    }
}
