import java.io.*;
import java.util.*;

public class GemStones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Character, Integer> hm_tot = new HashMap<Character,Integer>();
        for (int i = 0; i<n; i++){
            String s = in.next();
            int l = s.length();
            Map<Character, Integer> hm = new HashMap<Character,Integer>();
            for (int c=0; c<l; c++){
                if (!hm.containsKey(s.charAt(c)))
                    hm.put(s.charAt(c),1);
            }
            for (Character c:hm.keySet()){
                if (!hm_tot.containsKey(c))
                    hm_tot.put(c,1);
                else
                    hm_tot.put(c,1+hm_tot.get(c));
            }
        }
        int res = 0;
        for (Character i:hm_tot.keySet()){
            if (hm_tot.get(i)==n)
                res++;
        }
        System.out.println(res);
    }
}
