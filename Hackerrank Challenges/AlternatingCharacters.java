import java.io.*;
import java.util.*;

public class AlternatingCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i<T; i++){
            String s = in.next();
            int l = s.length();
            char comp = s.charAt(0);
            int res = 0;
            for (int c=1; c<l; c++){
                if (s.charAt(c)==comp){
                    res++;
                }
                else {
                    comp = s.charAt(c);
                }
            }
            System.out.println(res);
        }
    }
}
