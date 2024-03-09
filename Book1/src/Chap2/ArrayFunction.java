package Chap2;

public class ArrayFunction {
    static int sumOf(int[] a){
        int sum =0;
        for(int i=0; i<a.length; i++){
            sum+=i;
        }
        return sum;
    }

    static void copy(int[] a, int[] b){
        for(int i=0; i<b.length; i++){
            b[i] = a[i];
        }
    }
    static void reverse(int[] storage){
        for(int i=0; i<storage.length/2; i++){
            int temp = storage[i];
            storage[i] = storage[storage.length-i-1];
            storage[storage.length-i-1] = temp;
        }
    }

    static void copyReverse(int[] a, int[] b){
        for(int i=0; i<b.length/2; i++){
            b[i] = a[b.length-i-1];
            a[i] = b[b.length-i-1];
        }
    }
}
