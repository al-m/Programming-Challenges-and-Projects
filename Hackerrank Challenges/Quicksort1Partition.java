import java.io.*;
import java.util.*;

public class Quicksort1Partition {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i<n; i++)
            a[i] = in.nextInt();
        int p = a[0];
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> equal = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        for (int i:a){
            if (i<p)
                left.add(i);
            else if (i==p)
                equal.add(i);
            else
                right.add(i);
        }
        for (int i:left)
            System.out.print(i + " ");
        for (int i:equal)
            System.out.print(i + " ");
        for (int i:right)
            System.out.print(i + " ");
    }
}
