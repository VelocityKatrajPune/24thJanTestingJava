package logicalProgram;

import java.util.ArrayList;
import java.util.TreeSet;

public class RemoveDuplicateAndSort {
    public static void main(String[] args) {

        int marks[] = {12, 54, 23, 12, 87, 11, 100, 77, 12, 54};
        TreeSet<Integer> ts = new TreeSet<>();
        //for  for-each
        for (int m : marks) {
            ts.add(m);
        }
        System.out.println(ts);
        for (int t : ts) {
            System.out.println(t);
        }
        // show me highest roll num

        ArrayList<Integer> al = new ArrayList<>(ts);

        System.out.println(al);
//        System.out.println(al.getLast());
//        System.out.println(al.getFirst());
        System.out.println("get highest marks " + al.get(al.size() - 1));
        System.out.println("get 2nd highest marks " + al.get(al.size() - 2));
        System.out.println("get lowest marks " + al.get(0));
        System.out.println("get 2nd lowest marks " + al.get(1));
    }
}
