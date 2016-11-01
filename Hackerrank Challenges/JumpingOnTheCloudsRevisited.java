import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingOnTheCloudsRevisited {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int E = 99;
        int ind = k%n;
        if (c[ind]==1) E -= 2;
        while (ind!=0){
            ind = (ind+k)%n;
            E--;
            if (c[ind]==1) E -= 2;
        }
        System.out.println(E);
    }
}

