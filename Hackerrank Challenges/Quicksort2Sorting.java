import java.io.*;
import java.util.*;

public class Quicksort2Sorting {

    private static List<Integer> sort(List<Integer> arr){
        int n = arr.size();
        if (n==0) return new ArrayList<Integer>();
        if (n==1) return arr;
        else{
            int p = arr.get(0);
            List<Integer> left = new ArrayList<Integer>();
            List<Integer> equal = new ArrayList<Integer>();
            List<Integer> right = new ArrayList<Integer>();
            for (int i:arr){
                if (i<p){
                    left.add(i);
                }
                else if (i==p){
                    equal.add(i);
                }
                else{
                    right.add(i);
                }
            }
            List<Integer> res = new ArrayList<Integer>();
            res.addAll(sort(left));
            res.addAll(equal);
            res.addAll(sort(right));
            for (int i=0; i<n; i++)
                System.out.print(res.get(i) + " ");
            System.out.println("");
            return res;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i<n; i++)
            arr.add(in.nextInt());
        arr = sort(arr);
    }
}
