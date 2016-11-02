import java.io.*;
import java.util.*;

class Pair{
    int l;
    int r;
    public Pair(int l, int r){
        this.l = l;
        this.r = r;
    }
}

class PairComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair a, Pair b) {
        return (a.r < b.r ? -1 : (a.r == b.r ? (a.l<=b.l? -1 : 1) : 1));
    }
}

public class JimAndTheOrders {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Pair> customers = new ArrayList<Pair>();
        for (int i = 0; i<n; i++)
            customers.add(new Pair(i, in.nextInt() + in.nextInt()));
        Collections.sort(customers, new PairComparator());
        for (int i = 0; i<n; i++){
            int customer_number = customers.get(i).l + 1;
            System.out.print(customer_number + " ");
        }
    }
}
