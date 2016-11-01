import java.io.*;
import java.util.*;

public class MarkAndToys {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++)
            a[i]=in.nextInt();
        Arrays.sort(a);
        int tot = 0;
        int num = 0;
        for (int i:a){
            tot += i;
            if (tot>k)
                break;
            num++;
        }
        System.out.println(num);
    }
}
