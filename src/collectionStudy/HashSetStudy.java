package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {
    public static void main(String[] args) {
        HashSet<String>hashSet= new HashSet<>();

        hashSet.add("test");
        hashSet.add("test");
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add("java");
        hashSet.add("selenium");
        hashSet.add("automation");

        System.out.println(hashSet);
        hashSet.remove("test");
        System.out.println(hashSet);
        System.out.println( hashSet.size());

        //hashSet.clear();
        hashSet.contains("java");

        hashSet.isEmpty();
        //traversing through hashSet

        //for loop-->no index in set

        //for each
        for(String hs:hashSet)
        {
            System.out.println(hs);
        }

        //iterator
        Iterator<String> it = hashSet.iterator();
//        it.next();
//        it.next();
//        System.out.println(it.next());
        while (it.hasNext())
        {
            System.out.println(it.next());;
        }


    }
}
