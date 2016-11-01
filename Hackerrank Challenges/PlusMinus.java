import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int neg = 0, zero = 0, pos = 0;
        for (int i=0; i<N; i++){
            int x = in.nextInt();
            if (x<0)
                neg++;
            else if (x==0)
                zero++;
            else
                pos++;
        }
        System.out.printf("%4f",((double)pos)/N);
        System.out.printf("\n%4f",((double)neg)/N);
        System.out.printf("\n%4f",((double)zero)/N);
    }
}
