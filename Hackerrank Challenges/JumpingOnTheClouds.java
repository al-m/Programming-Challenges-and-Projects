import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int i=0;
        int jumps = 0;
        while (i<n){
            i++;
            jumps++;
            if (i-1<n-3){
                if (c[i+1]==0)
                    i++;
            }
            else
                break;
        }
        System.out.println(jumps);
    }
}

