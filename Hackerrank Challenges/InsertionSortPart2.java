import java.io.*;
import java.util.*;

public class InsertionSortPart2 {

    public static void insertionSortPart2(int[] arr){
        int n = arr.length;
        while (testArray(arr)){
            for (int i=1; i<n; i++)
                reinsert(arr, i);
        }
    }
    
    private static void reinsert(int[] arr, int ind){
        int e = arr[ind];
        int i = ind-1;
        while (arr[i]>e){
            arr[i+1]=arr[i];
            i--;
            if (i==-1)
                break;
        }
        arr[i+1]=e;
        printArray(arr);
    }
    
    private static boolean testArray(int[] arr){
        int n = arr.length;
        boolean test = false;
        for (int i = 0; i<n-1; i++){
            if (arr[i]>arr[i+1]){
                test = true;
                break;
            }
        }
        return test;
    }
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}

