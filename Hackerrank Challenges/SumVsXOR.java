import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumVsXOR {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long res = 0;
        while (n>0){
            if (n%2==0) res++;
            n = n>>>1;
            }
        System.out.println((long) Math.pow(2,res));
        }
}

