import java.io.*;
import java.util.*;

public class CountingSort3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[100];
        String s = "";
        for (int i = 0; i<n; i++){
            arr[in.nextInt()]++;
            s = in.next();
        }
        int tot = 0;
        for (int i = 0; i<100; i++){
            tot += arr[i];
            arr[i] = tot;
        }
        for (int i:arr)
            System.out.print(i + " ");
    }
}
