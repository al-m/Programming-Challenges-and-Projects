import java.io.*;
import java.util.*;

public class CountingSort2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i<n; i++)
            arr[in.nextInt()]++;
        for (int i = 0; i<100; i++){
            for (int j = 0; j<arr[i]; j++)
                System.out.print(i + " ");
        }
    }
}
