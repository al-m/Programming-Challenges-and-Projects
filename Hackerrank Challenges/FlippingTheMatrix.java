import java.io.*;
import java.util.*;

public class FlippingTheMatrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int cas = 0; cas<q; cas++){
            int n = in.nextInt();
            int[][] mat = new int[2*n][2*n];
            for (int i=0; i<2*n; i++){
                for (int j=0; j<2*n; j++){
                    mat[i][j] = in.nextInt();
                }
            }
            int res = 0;
            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++){
                    res += Math.max(Math.max(mat[i][j],mat[2*n-i-1][j]), Math.max(mat[i][2*n-1-j],mat[2*n-1-i][2*n-1-j]));
                }
            }
            System.out.println(res);
        }
    }
}
