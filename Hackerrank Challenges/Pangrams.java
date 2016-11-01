import java.io.*;
import java.util.*;

public class Pangrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        sentence = sentence.replaceAll("\\s+","");
        sentence = sentence.toLowerCase();
        int[] letters = new int[26];
        int l = sentence.length();
        //System.out.println(sentence);
        for (int i = 0; i<l; i++){
            letters[sentence.charAt(i) - 'a'] = 1;
        }
        boolean res = false;
        for (int i:letters){
            if (i==0) res=true;
        }
        //System.out.println(Arrays.toString(letters));
        if (res)
            System.out.println("not pangram");
        else
            System.out.println("pangram");
    }
}
