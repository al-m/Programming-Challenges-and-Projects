import java.io.*;
import java.util.*;

public class FlatlandSpaceStations {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if (n==m)
            System.out.println(0);
        else{
            int[] stations = new int[m];
            for (int i = 0; i<m; i++)
                stations[i]=in.nextInt();
            Arrays.sort(stations);
            if (m==1)
                System.out.println(Math.max(stations[0],n-stations[0]-1));
            else{
                int diff = stations[0];
                for (int i=1; i<m; i++){
                    diff = Math.max(diff,(stations[i]-stations[i-1])/2);
                }
                diff = Math.max(stations[0],Math.max(n-1-stations[m-1],diff));
                System.out.println(diff);
            }
        }
    }
}
