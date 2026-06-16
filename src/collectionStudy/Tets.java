package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;

public class Tets {
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
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
           it.next();
           it.remove();
        }
        System.out.println(arrayList);


    }


}
