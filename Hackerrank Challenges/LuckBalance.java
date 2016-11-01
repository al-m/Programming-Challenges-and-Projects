import java.io.*;
import java.util.*;

public class LuckBalance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] val = new int[n];
        int[] imp = new int[n];
        int[] important = new int[n];
        int are_imp = 0;
        for (int i =0; i<n; i++){
            val[i] = in.nextInt();
            imp[i] = in.nextInt();
            if (imp[i]==1){
                important[are_imp]=val[i];
                are_imp++;
            }   
        }
        int tot = 0;
        for (int i=0; i<n; i++){
            if (imp[i]==0)
                tot += val[i];
        }
        Arrays.sort(important);
        for (int i = 0; i<are_imp; i++){
            if (i<k) tot += important[n-i-1];
            else tot -= important[n-i-1];
        }
        System.out.println(tot);
    }
}
