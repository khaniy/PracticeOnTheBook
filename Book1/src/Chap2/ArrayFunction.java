package Chap2;

public class ArrayFunction {
    public static int sumOf(int[] a){
        int sum =0;
        for(int i=0; i<a.length; i++){
            sum+=i;
        }
        return sum;
    }

    public static void copy(int[] a, int[] b){
        for(int i=0; i<b.length; i++){
            b[i] = a[i];
        }
    }
    public static void reverse(int[] storage){
        for(int i=0; i<storage.length/2; i++){
            int temp = storage[i];
            storage[i] = storage[storage.length-i-1];
            storage[storage.length-i-1] = temp;
        }
    }

    public static void copyReverse(int[] a, int[] b){
        for(int i=0; i<b.length/2; i++){
            b[i] = a[b.length-i-1];
            b[b.length-i-1] = a[i];
            if(b.length%2 != 0){
                b[b.length/2] = a[a.length/2];
            }
        }
    }
}
