import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSortPart1 {
    
    private static void printTheArray(int[] arr){
        for (int i:arr)
            System.out.printf(i + " ");
        System.out.printf("\n");
    }

    public static void insertIntoSorted(int[] ar) {
        int n = ar.length;
        int e = ar[n-1];
        int ind = n-2;
        while (ar[ind]>e){
            ar[ind+1] = ar[ind];
            ind--;
            printTheArray(ar);
            if (ind==-1)
                break;
        }
        ar[ind+1]=e;
        printTheArray(ar);
        
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}

