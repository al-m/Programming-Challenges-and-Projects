import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringConstruction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            Map<Character, Integer> hm = new HashMap<Character, Integer>();
            for (int i=0; i<s.length(); i++) hm.put(s.charAt(i),1);
            System.out.println(hm.size());
        }
        
    }
}

