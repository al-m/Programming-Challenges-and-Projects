import java.io.*;
import java.util.*;

public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int cas=0; cas<t; cas++){
            int n = in.nextInt();
            int i = n;
            while (i>=0){
                if (i%3==0 && (n-i)%5==0)
                    break;
                i--;
            }
            String res;
            if (i==-1){
                res = Integer.toString(-1);
            }
            else
                res = new String(new char[i]).replace("\0","5") + new String(new char[n-i]).replace("\0","3");
            System.out.println(res);
        }
    }
}
