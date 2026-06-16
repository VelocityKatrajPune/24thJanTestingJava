package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorNew {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(88);
        arrayList.add(23);
        arrayList.add(45);
        arrayList.add(11);
        arrayList.add(78);
        arrayList.add(98);
        arrayList.add(24);

        Iterator<Integer> it = arrayList.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        //  it.next();

        System.out.println("========================");
        Iterator<Integer> it1 = arrayList.iterator();
        while (it1.hasNext())
        {
            System.out.println(it1.next());
        }








    }
}
