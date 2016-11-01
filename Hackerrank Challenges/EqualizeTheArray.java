import java.io.*;
import java.util.*;

public class EqualizeTheArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer,Integer> vals = new HashMap<Integer,Integer>();
        for (int i=0; i<n; i++){
            int x = in.nextInt();
            if (!vals.containsKey(x)){
                vals.put(x,1);
            }
            else
                vals.put(x,vals.get(x)+1);
        }
        int res = 0;
        for (int value: vals.values()){
            res = Math.max(res,value);
        }
        System.out.println(n-res);
    }
}
