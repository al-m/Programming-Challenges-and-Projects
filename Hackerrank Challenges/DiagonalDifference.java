import java.io.*;
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] arr = new int[N][N];
        int sum1 = 0, sum2 = 0;
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                arr[i][j]=in.nextInt();
            }
            sum1 += arr[i][i];
            sum2 += arr[i][N-1-i];
        }
        System.out.println(Math.abs(sum1-sum2));
    }
}
