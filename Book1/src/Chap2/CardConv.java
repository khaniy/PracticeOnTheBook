package Chap2;

public class CardConv {
    public static char[] convert(int x, int r, char[] d){
        String dChar = "0123456789ABCDEFGHIJKLMONPQRSTUVWXYZ";
        int loc = 0;
        do{
            d[loc++] = dChar.charAt(x%r);
            x /= r;
        } while (x!=0);

        for(int i=0; i<loc/2; i++){
            char c = d[i];
            d[i] = d[loc-i-1];
            d[loc-i-1] = c;
        }
        return d;
    }
}
