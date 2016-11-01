import java.io.*;
import java.util.*;

public class SaveThePrisoner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0; i<T; i++){
            int N = in.nextInt();
            int M = in.nextInt();
            int S = in.nextInt();
            int res = (M+S-1)%N;
            if (res==0) res=N;
            System.out.println(res);
        }
    }
}
