import java.io.*;
import java.util.*;

public class GameOfStones {

    private static boolean[] strategy = new boolean[100];
    
    public static void main(String[] args) {
        strategy[0] = false;
        strategy[1] = true;
        strategy[2] = true;
        strategy[3] = true;
        strategy[4] = true;
        for (int i = 5; i<100; i++){
            strategy[i] = (!strategy[i-2] || !strategy[i-3] || !strategy[i-5]);
        }
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int cas = 0; cas<t; cas++){
            int n = in.nextInt();
            if (strategy[n-1])
                System.out.println("First");
            else
                System.out.println("Second");
        }
    }
}
