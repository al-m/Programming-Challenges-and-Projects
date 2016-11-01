import java.io.*;
import java.util.*;

public class PriyankaAndToys {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] toys = new int[n];
        for (int i = 0; i<n; i++)
            toys[i] = in.nextInt();
        Arrays.sort(toys);
        int cost = 0;
        int ind = 0;
        while (ind<n){
            int weight = toys[ind];
            cost++;
            while (ind<n && toys[ind]<=weight+4)
                ind++;
        }
        System.out.println(cost);
    }
}
