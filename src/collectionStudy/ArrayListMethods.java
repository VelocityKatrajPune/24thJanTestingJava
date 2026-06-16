package collectionStudy;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        boolean result = arrayList.add(99);
        System.out.println("Element add status is " + result);
        arrayList.add(91);
        arrayList.add(94);
        System.out.println(arrayList);
        arrayList.add(1, 100);
        System.out.println(arrayList);
        arrayList.addLast(40);
        System.out.println(arrayList);
        arrayList.addFirst(1);
        System.out.println(arrayList);
        System.out.println("==========================");

//        arrayList.clear();
//        System.out.println(arrayList);

        Object arrayListCloned = arrayList.clone();
        System.out.println("arrayListCloned--> " + arrayListCloned);
        System.out.println("arrayList-->" + arrayList);

        arrayList.add(23);
        System.out.println("arrayList-->" + arrayList);
        boolean result1 = arrayList.equals(arrayListCloned);
        System.out.println("equal result is " + result1);

        boolean result2 = arrayList.contains(230);
        System.out.println(result2);

        Integer myElement = arrayList.get(2);
        System.out.println(myElement);

        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());

        int indexOfTest = arrayList.indexOf(2);
        System.out.println(indexOfTest);

        //arrayList.lastIndexOf(1);

        System.out.println(arrayList);

        int sizeOfArrayList = arrayList.size();
        System.out.println("size of ArrayList is " + sizeOfArrayList);

        System.out.println("==================================");
        System.out.println(arrayList.isEmpty());
        System.out.println("==================================");
        //arrayList.remove(99);
        System.out.println(arrayList);
//        boolean result3 = arrayList.remove(99);
//        System.out.println(result3);
        Integer removeElement = arrayList.remove(2);
        System.out.println(removeElement);
        System.out.println(arrayList);

        arrayList.removeFirst();
        arrayList.removeLast();
        System.out.println(arrayList);
        arrayList.set(3, 90);
        System.out.println(arrayList);

    }
}
