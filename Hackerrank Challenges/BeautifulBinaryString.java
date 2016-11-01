import java.io.*;
import java.util.*;

public class BeautifulBinaryString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int res = 0;
        for (int i=0; i<n-2; i++){
            if (s.charAt(i)=='0'){
                if (s.charAt(i+1)=='1'){
                    if (s.charAt(i+2)=='0'){
                        res++;
                        if (i+2<n-2){
                            if (s.substring(i+3,i+5).equals("10")){
                                i+=2;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}
