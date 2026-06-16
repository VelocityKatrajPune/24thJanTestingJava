package collectionStudy;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListStudy {
    public static void main(String[] args) {


        ArrayList<String> arrayList1 = new ArrayList<>();
        System.out.println(arrayList1);
        arrayList1.add("test");
        arrayList1.add("test1");
        arrayList1.add("test2");
        System.out.println(arrayList1);

        for (String ar : arrayList1) {
            System.out.println(ar);
        }

        System.out.println("===================");

        ArrayList<Object> arrayList= new ArrayList<>();
        arrayList.add("pune");
        arrayList.add(true);
        arrayList.add(12.122f);
        arrayList.add(456);
        arrayList.add('K');
        arrayList.add("pune");
        for(Object a:arrayList)
        {
            System.out.println(a);
        }


    }
}
