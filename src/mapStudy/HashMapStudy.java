package mapStudy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapStudy {
    public static void main(String[] args) {

        // HashMap is a class that implements the Map interface and uses a hash table to store key-value pairs.
        // It allows null values and the null key.
        // It is not synchronized and is not thread-safe.
        // It does not guarantee any specific order of the elements.

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        System.out.println("HashMap: " + map);

//        // Accessing elements
        System.out.println("Value for key 3: " + map.get(3));
//
//        // Removing an element
        map.remove(2);
        System.out.println("HashMap after removing key 2: " + map);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(1));
        System.out.println("===============================");
        System.out.println(map.containsValue("Ten"));
        System.out.println(map.containsValue("One"));
        System.out.println("===============================");
        System.out.println(map.size());
        //  map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map);
        map.replace(5, "Fifty");
        System.out.println(map);
        System.out.println("===============================");
        System.out.println(map.keySet());
        //for each, iterator, entrySet, keySet,

        Set<Integer> myKeys = map.keySet();
        for (Integer mk : myKeys) {
            System.out.println(mk);
        }
        System.out.println("===============================");
        Set<Integer> myKeys1 = map.keySet();
        for (Integer mk1 : myKeys1) {
            System.out.println(mk1 + ": " + map.get(mk1));
        }

        System.out.println("===============================");
        Set<Map.Entry<Integer, String>> entry = map.entrySet();
        for (Map.Entry<Integer, String> e : entry) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println("===============================");
        TreeMap<Character, String> treeMap = new TreeMap<>();
        treeMap.put('C', "Cat");
        treeMap.put('A', "Apple");
        treeMap.put('B', "Ball");
        treeMap.put('D', "Dog");
        System.out.println(treeMap);
        Set<Character> ks = treeMap.keySet();
        for (Character k : ks) {
            System.out.println(k + ": " + treeMap.get(k));
        }

        }
}
