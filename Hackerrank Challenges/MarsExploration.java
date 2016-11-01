import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int l = S.length();
        int res = 0;
        for (int i=0; i<l; i+=3){
            if (S.charAt(i)!='S') res++;
            if (S.charAt(i+1)!='O') res++;
            if (S.charAt(i+2)!='S') res++;
        }
        System.out.println(res);
    }
}

