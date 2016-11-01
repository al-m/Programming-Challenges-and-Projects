import java.io.*;
import java.util.*;

public class MaximumPerimeterTriangle {

    private static boolean isTriangle(int a, int b, int c){
        return (a<b+c && b<a+c && c<a+b);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] sticks = new int[n];
        for (int i = 0; i<n; i++)
            sticks[i]=in.nextInt();
        Arrays.sort(sticks);
        int side1, side2, side3;
        for (int i=0; i<n-2; i++){
            side1 = sticks[n-i-1];
            side2 = sticks[n-i-2];
            side3 = sticks[n-i-3];
            if (isTriangle(side1, side2, side3)){
                System.out.println(side3 + " " + side2 + " " + side1);
                break;
            }
            else if (i==n-3)
                System.out.println(-1);
        }
    }
}
