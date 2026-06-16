package collectionStudy;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList= new LinkedList<>();

        linkedList.add(12);
        linkedList.add(12);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add(13);
        linkedList.add(19);
        linkedList.add(22);

        System.out.println(linkedList);
        linkedList.add(1,100);
        System.out.println(linkedList);
        System.out.println( linkedList.get(1));
        linkedList.addLast(111);
        linkedList.clone();
        linkedList.addFirst(99);
        //linkedList.clear();
        linkedList.contains(22);
        linkedList.offer(33);
        linkedList.offerFirst(77);
        linkedList.offerLast(78);
        System.out.println(linkedList);

        System.out.println(linkedList.peek());
        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList);

        System.out.println(linkedList.poll());
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollLast());
        System.out.println(linkedList);

        linkedList.pop();
        System.out.println(linkedList);

        //traversing

        //for for each  iterator list-iterator

        ListIterator<Integer> lit = linkedList.listIterator();
        while (lit.hasNext())
        {
            System.out.println(lit.next());
        }









    }
}
