import java.io.*;
import java.util.*;

public class NonDivisibleSubset {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[k];
        for (int i=0; i<n; i++){
            a[in.nextInt()%k]++;
        }
        int res = 0;
        if (a[0]!=0)
            res++;
        for (int i=1; i<k/2+k%2; i++)
            res += Math.max(a[i],a[k-i]);
        if (k%2==0 && a[k/2]!=0)
            res += 1;
        System.out.println(res);
    }
}
