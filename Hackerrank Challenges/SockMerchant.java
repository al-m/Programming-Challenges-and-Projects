import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        Map<Integer, Integer> socks = new HashMap<Integer, Integer>();
        int count;
        for (int i:c){
            count = socks.containsKey(i) ? socks.get(i)+1 : 1;
            socks.put(i,count);
        }
        int res = 0;
        for (int i:socks.keySet()){
            res += socks.get(i)/2;
        }
        System.out.println(res);
    }
}

