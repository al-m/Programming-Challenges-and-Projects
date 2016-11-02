import java.io.*;
import java.util.*;

public class CountingSort1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i<n; i++)
            arr[in.nextInt()]++;
        for (int i:arr)
            System.out.print(i + " ");
    }
}
