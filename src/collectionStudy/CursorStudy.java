package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CursorStudy {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(88);
        arrayList.add(23);
        arrayList.add(45);
        arrayList.add(11);
        arrayList.add(78);
        arrayList.add(98);
        arrayList.add(24);

        System.out.println(arrayList);
        //System.out.println(arrayList.get(4));

        //for loop-->
        //ini=0      condition=object.size()-1   updation= ++
//
        System.out.println("===============for loop==================");
        for (int i = 0; i <= arrayList.size() - 1; i++) {
            System.out.println(arrayList.get(i));//i=0-->max
        }
        System.out.println("===============for each loop=================");
        //for each loop-->advanced for loop
        for (Integer al : arrayList) {
            System.out.println(al);
        }
        System.out.println("=================iterator===============");
        //iterator-->cursor
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
//            it.remove();
        }
        System.out.println(arrayList);
        System.out.println("=================List-iterator===============");

        ListIterator<Integer> lit = arrayList.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
            //lit.set();
        }
        System.out.println("=================Reverse-iterator===============");
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

    }
}
