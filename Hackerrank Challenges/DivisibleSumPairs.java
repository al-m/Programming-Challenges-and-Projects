import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] test = new int[k];
        for (int i:a)
            test[i%k]++;
        int res = 0;
        for (int i:a)
            res += test[(k-(i%k))%k];
        if (k%2==0)
            res = (res-test[k/2]-test[0])/2;
        else
            res = (res-test[0])/2;
        System.out.println(res);
    }
}

