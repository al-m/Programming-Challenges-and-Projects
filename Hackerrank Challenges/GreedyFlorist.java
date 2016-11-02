import java.io.*;
import java.util.*;

public class GreedyFlorist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] flowers = new int[n];
        for (int i = 0; i<n; i++)
            flowers[i] = in.nextInt();
        Arrays.sort(flowers);
        int turns = n/k;
        int end = n - k*turns;
        int total = 0;
        for (int turn = 0; turn<turns; turn++){
            for (int ind = 0; ind<k; ind++){
                //System.out.println(end + k*(turns-turn-1)+ind);
                total += (turn+1)*flowers[end + k*(turns-turn-1) + ind];
            }
        }
        for (int i = 0; i<end; i++){
            total += (turns+1)*flowers[i];
        }
        System.out.println(total);
    }
}
