import java.io.*;
import java.util.*;

public class QuicksortInPlace {

    private static void swap(int[] arr, int i, int j){
        if (i!=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    private static void sort(int[] arr, int start, int end){
        if (start<end){
            int p = partition(arr, start, end);
            sort(arr, start, p-1);
            sort(arr, p+1, end);
        }
    }
    
    private static int partition(int[] arr, int start, int end){
        int p = arr[end];
        int i = start;
        for (int j = start; j<end; j++){
            if (arr[j]<=p){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,end);
        for (int ind=0; ind<arr.length; ind++)
            System.out.print(arr[ind] + " ");
        System.out.println("");
        return i;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = in.nextInt();
        sort(arr, 0, n-1);
    }
}
