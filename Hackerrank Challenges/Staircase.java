import java.io.*;
import java.util.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i=0; i<N; i++){
            System.out.println(new String(new char[N-i-1]).replace("\0"," ") + new String(new char[i+1]).replace("\0","#"));
        }
    }
}
