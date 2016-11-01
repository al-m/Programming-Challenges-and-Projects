import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrangeCounter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long block = 3;
        long val = 3;
        while (t>block){
            val *= 2;
            block += val;
        }
        System.out.println(block+1-t);
    }
}

