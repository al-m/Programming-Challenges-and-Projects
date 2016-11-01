import java.io.*;
import java.util.*;

public class CutTheSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] a = new int[N];
        for (int i=0; i<N; i++)
            a[i] = in.nextInt();
        Arrays.sort(a);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int val = a[0];
        int count = 0;
        for (int i:a){
            if (i==val)
                count++;
            else{
                al.add(count);
                count = 1;
                val = i;
            }
        }
        int num = N;
        System.out.println(N);
        for (int i:al){
            num -= i;
            System.out.println(num);
        }
    }
}
