package logicalProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindRepeatativeStringFromString {
    public static void main(String[] args) {
        String str = "abc xyz abc pqr abc pqr lmn";
        String[] ar = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= ar.length - 1; i++) {
            String temp = ar[i];
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }

        System.out.println(map);

        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        for (Map.Entry<String, Integer> e : entry) {
            System.out.println(e.getKey() + "= " + e.getValue());
        }


    }
}
