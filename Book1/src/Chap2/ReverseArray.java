package Chap2;

public class ReverseArray {
    static int[] reverse(int[] storage){
        for(int i=0; i<storage.length/2; i++){
            int temp = storage[i];
            storage[i] = storage[storage.length-i-1];
            storage[storage.length-i-1] = temp;
        }
        return storage;
    }
}
