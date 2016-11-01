import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long num1 = 0;
        long l = s.length();
        for (int i=0; i<l; i++){
            if (s.charAt(i)=='a')
                num1++;
        }
        long res = num1*(n/l);
        for (int i=0; i<n%l; i++){
            if (s.charAt(i)=='a')
                res++;
        }
        System.out.println(res);
    }
}

