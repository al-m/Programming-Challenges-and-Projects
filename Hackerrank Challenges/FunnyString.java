import java.io.*;
import java.util.*;

public class FunnyString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int cas = 0; cas<t; cas++){
            String S = in.next();
            int n = S.length();
            boolean res = (Math.abs((int) S.charAt(1)-S.charAt(0))==Math.abs((int) S.charAt(n-1)-S.charAt(n-2)));
            //System.out.println(res);
            for (int i=2; i<n-1 && res; i++){
                res = (Math.abs((int) S.charAt(i)-S.charAt(i-1))==Math.abs((int) S.charAt(n-i-1)-S.charAt(n-i)));
                //System.out.println(res);
                if (i==n-2 && res)
                    System.out.println("Funny");
            }
            if (!res)
                System.out.println("Not Funny");
        }
    }
}
