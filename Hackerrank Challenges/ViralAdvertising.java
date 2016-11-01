import java.io.*;
import java.util.*;

public class ViralAdvertising {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 5;
        int tot = 0;
        for (int i = 0; i<n; i++){
            res /=2;
            tot += res;
            res *= 3;
        }
        System.out.println(tot);
    }
}
