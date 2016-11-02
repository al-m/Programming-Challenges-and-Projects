import java.io.*;
import java.util.*;

public class CuttingBoards {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int cas = 0; cas<q; cas++){
            int m = in.nextInt();
            int n = in.nextInt();
            long[] y = new long[m-1];
            long[] x = new long[n-1];
            for (int i = 0; i<m-1; i++)
                y[i] = in.nextLong();
            for (int i = 0; i<n-1; i++)
                x[i] = in.nextLong();
            Arrays.sort(x);
            Arrays.sort(y);
            int i = n-2;
            int j = m-2;
            int segments_x = 1;
            int segments_y = 1;
            long total = 0;
            while (i>=0 && j>=0){
                if (y[j]>=x[i]){
                    //System.out.println(y[j] + "(in y)>=" + x[i] + "(in x), we cut horizontally at height " + j + ", traversing " + segments_y + " segments.");
                    total += segments_y*y[j];
                    j--;
                    segments_x++;
                }
                else{
                    //System.out.println(x[i] + "(in x)>=" + y[j] + "(in y), we cut vertically at length " + i + ", traversing " + segments_x + " segments.");
                    total += segments_x*x[i];
                    i--;
                    segments_y++;
                }
            }
            if (i==-1){
                while (j>=0){
                    //System.out.println("No more cuts to do vertically, we cut horizontally at height " + j + ", traversing " + segments_y + " segments.");
                    total += segments_y*y[j];
                    j--;
                    segments_x++;
                }
            }
            if (j==-1){
                while (i>=0){
                    //System.out.println("No more cuts to do horizontally, we cut vertically at length " + i + ", traversing " + segments_x + " segments.");
                    total += segments_x*x[i];
                    i--;
                    segments_y++;
                }
            }
            long modul = (int) Math.pow(10,9) + 7;
            total %= modul;
            System.out.println(total);
        }
    }
}
