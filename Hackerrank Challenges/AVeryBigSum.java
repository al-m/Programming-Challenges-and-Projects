import java.io.*;
import java.util.*;

public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
		long total = 0L;
        for (int i=0; i<N; i++)
            total += in.nextLong();
        System.out.println(total);
    }
}
