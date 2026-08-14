package logicalProgram;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindLargestNumber {
    public static void main(String[] args) {
        int ar[] = {12, 32, 56, 78, 11, 88, 9, 65};
        TreeSet<Integer> ts = new TreeSet<>();
        for (int a : ar) {
            ts.add(a);
        }
        System.out.println(ts);
        ArrayList<Integer>al= new ArrayList<>(ts);
        System.out.println( "largest number "+al.get(al.size()-1));
        System.out.println( "2nd largest number "+al.get(al.size()-2));
        System.out.println("smallest number "+al.get(0));
        System.out.println("2nd smallest number "+al.get(1));

    }

}
