import java.io.*;
import java.util.*;

public class BonAppetit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int not_eaten=0;
        int total = 0;
        for (int i=0; i<n; i++){
            if (i==k){
                not_eaten = in.nextInt();
                continue;
            }
            total += in.nextInt();
        }
        total /=2;
        int b = in.nextInt();
        if (total==b) System.out.println("Bon Appetit");
        else System.out.println(not_eaten/2);
    }
}
