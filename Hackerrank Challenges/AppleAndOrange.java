import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int apples = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            int d = in.nextInt();
            if (a+d >= s && a+d <= t) apples++;
        }
        System.out.println(apples);
        int oranges = 0;
        for(int orange_i=0; orange_i < n; orange_i++){
            int d = in.nextInt();
            if (b+d >= s && b+d <= t) oranges++;
        }
        System.out.println(oranges);
    }
}
