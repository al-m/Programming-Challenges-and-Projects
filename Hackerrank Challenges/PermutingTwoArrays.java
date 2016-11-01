import java.io.*;
import java.util.*;

public class PermutingTwoArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int cas = 0; cas<q; cas++){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i=0; i<n; i++)
                a[i] = in.nextInt();
            for (int i=0; i<n; i++)
                b[i] = in.nextInt();
            Arrays.sort(b);
            Arrays.sort(a);
            boolean res = true;
            for (int i=0; i<n; i++)
                res &= (a[i]+b[n-i-1]>=k);
            if (res)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
