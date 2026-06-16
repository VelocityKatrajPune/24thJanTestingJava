package collectionStudy;

import java.util.TreeSet;

public class TreeSetStudy {
    public static void main(String[] args) {

        TreeSet<Object> treeSet = new TreeSet<>();
        treeSet.add(12);
        //  treeSet.add("Test"); class cast exception
        //  treeSet.add(null); NullPointerException
        treeSet.add(32);
        treeSet.add(22);
        treeSet.add(42);
        treeSet.add(12);
        treeSet.add(62);
        treeSet.add(52);

        System.out.println(treeSet);

        System.out.println(treeSet.ceiling(55));
        System.out.println(treeSet.ceiling(52));
        System.out.println(treeSet.ceiling(51));
        System.out.println(treeSet.ceiling(100));
        System.out.println(treeSet.ceiling(0));
        System.out.println(treeSet.floor(22));
        System.out.println(treeSet.floor(55));
        System.out.println(treeSet.floor(10));

        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet);


    }
}
