import java.io.*;
import java.util.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int test_case = 0; test_case<T; test_case++){
            int N = in.nextInt();
            int K = in.nextInt();
            String res = "NO";
            int counter = 0;
            for (int i=0; i<N; i++){
                if (in.nextInt()<=0)
                    counter++;
            }
            if (counter<K)
                res = "YES";
            System.out.println(res);
        }
    }
}
