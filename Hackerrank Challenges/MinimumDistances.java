import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumDistances {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int min_dist=Integer.MAX_VALUE;
        Map<Integer,Integer> vals = new HashMap<Integer,Integer>();
        for(int i=0; i<n; i++){
            if (!vals.containsKey(A[i]))
                vals.put(A[i],i);
            else{
                min_dist = Math.min(i-vals.get(A[i]),min_dist);
                vals.put(A[i],i);
            }
        }
        if (min_dist==Integer.MAX_VALUE) min_dist=-1;
        System.out.println(min_dist);
    }
}

