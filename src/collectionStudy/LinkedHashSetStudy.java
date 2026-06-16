package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.add(23);
        linkedHashSet.add(13);
        linkedHashSet.add(22);
        linkedHashSet.add(33);
        linkedHashSet.add(43);
        linkedHashSet.add(23);
        linkedHashSet.add(null);
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);
        linkedHashSet.addLast(42);
        linkedHashSet.addFirst(11);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.size());
        linkedHashSet.getFirst();
        linkedHashSet.getLast();
        linkedHashSet.removeFirst();
        linkedHashSet.remove(33);
        //linkedHashSet.clear();
        linkedHashSet.clone();
        //linkedHashSet.equals();
        for(  Integer l:linkedHashSet)
        {
            System.out.println(l);
        }
        System.out.println("==========================");
        Iterator<Integer> it = linkedHashSet.iterator();
        //System.out.println(it.next());
        while (it.hasNext())
        {
            System.out.println(it.next());
        }








    }
}
