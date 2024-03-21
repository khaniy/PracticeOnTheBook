package Chap5;

public class QueenB {
    static int[] pos = new int[8];

    static void print(){
        for(int i=0; i<8; i++)
            System.out.printf("%2d",pos[i]);
        System.out.println();
    }

    static void set(int i){ // i 는 열
        for(int j=0; j<8; j++){
            pos[i] = j;
            if (i==7)
                print();
            else
                set(i+1);
        }

    }
}
