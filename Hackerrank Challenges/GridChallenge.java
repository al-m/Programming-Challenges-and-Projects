import java.io.*;
import java.util.*;

public class GridChallenge {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int cas = 0; cas<t; cas++){
            int n = in.nextInt();
            char[][] letters = new char[n][n];
            for (int i=0; i<n; i++){
                String s = in.next();
                for (int j = 0; j<n; j++){
                    letters[i][j] = s.charAt(j);
                }
                Arrays.sort(letters[i]);
            }
            //System.out.println(Arrays.deepToString(letters));
            boolean res = true;
            for (int j = 0; j<n; j++){
                if (!res) break;
                for (int i = 0; i<n-1; i++){
                    res = (letters[i][j]<=letters[i+1][j]);
                    //System.out.println(letters[i][j] + " " + letters[i+1][j] + " " + res);
                    if (!res) break;
                }
            }
            if (res) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
