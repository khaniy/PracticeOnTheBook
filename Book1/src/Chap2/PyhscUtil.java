package Chap2;

public class PyhscUtil {
    static double aveHeight(PhyscData[] dat){
        double sum=0;
        for(int i=0; i<dat.length; i++){
            sum += dat[i].height;
        }
        return sum;
    }

    static void distVision(PhyscData[] dat, int[] dist){
        int i=0;
        dist[i] = 0;
        for(i=0; i<dat.length; i++)
            if (dat[i].vision >=0.0 && dat[i].vision <= 21 / 10.0)
                dist[(int)(dat[i].vision * 10)]++;
    }
}
