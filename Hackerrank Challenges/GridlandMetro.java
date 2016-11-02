import java.io.*;
import java.util.*;
import java.math.*;

class Triplet{
    int val;
    int left;
    int right;
    public Triplet(int val, int left, int right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class TripletComparator implements Comparator<Triplet> {
    @Override
    public int compare(Triplet a, Triplet b) {
        return (a.val < b.val ? -1 : 
                (a.val == b.val ? (a.left < b.left ? -1 : 
                                   a.left==b.left ? (a.right < b.right ? -1 : 
                                                     (a.right==b.right? 0 : 1) ) : 1) : 1));
    }
}

public class GridlandMetro {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        List<Triplet> tracks = new ArrayList<Triplet>();
        for (int i = 0; i<k; i++){
            int row = in.nextInt();
            int start = in.nextInt();
            int end = in.nextInt();
            tracks.add(new Triplet(row, start, end));
        }
        Collections.sort(tracks, new TripletComparator());
        BigInteger count = new BigInteger("0");
        if (k>0){
        int val1 = tracks.get(0).val;
        int left1 = tracks.get(0).left;
        int right1 = tracks.get(0).right;
        for (int i = 1; i<k; i++){
            //System.out.println(val1 + ", left: " + left1 + ", right: " + right1);
            if (val1==tracks.get(i).val){
                if (right1>=tracks.get(i).left){
                    if (right1<tracks.get(i).right)
                        right1 = tracks.get(i).right;
                }
                else{
                    count = count.add(BigInteger.valueOf(right1-left1 + 1));
                    //count += right1-left1 + 1 ;
                    left1 = tracks.get(i).left;
                    right1 = tracks.get(i).right;
                }
            }
            else{
                count = count.add(BigInteger.valueOf(right1-left1 + 1));
                //count += right1-left1 + 1 ;
                val1 = tracks.get(i).val;
                left1 = tracks.get(i).left;
                right1 = tracks.get(i).right;
            }
            //System.out.println(val1 + ", left: " + left1 + ", right: " + right1);
        }
        count = count.add(BigInteger.valueOf(right1-left1 + 1));
            //count += right1-left1 + 1 ;
        }
        count = count.negate();
        BigInteger total = BigInteger.valueOf(n).multiply(BigInteger.valueOf(m));
        count = count.add(total);
        System.out.println(count.toString());
    }
}
