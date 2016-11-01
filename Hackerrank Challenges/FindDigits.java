import java.io.*;
import java.util.*;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0; i<T; i++){
            int res = 0;
            int n = in.nextInt();
            String s = Integer.toString(n);
            int l = s.length();
            for (int j=0; j<l; j++){
                int c = Character.getNumericValue(s.charAt(j));
                if (c!=0){
                    if (n%c==0) res++;
                }
            }
            System.out.println(res);
        }
    }
}
