import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String res = "NO";
        int k=0;
        int test=0;
        if (v1!=v2){
            k = (x2-x1)%(v1-v2);
            test = (x2-x1)*(v1-v2);
            if (k==0 && test>=0)
                res = "YES";
        }
        else if (x1==x2)
                res = "YES";
        System.out.println(res);
    }
}

