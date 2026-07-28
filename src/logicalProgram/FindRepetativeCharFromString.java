package logicalProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindRepetativeCharFromString {
    public static void main(String[] args) {
        String str = "asasdnsdkfhsdffkeqjfbje";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i <= str.length() - 1; i++) {//a,s,a
            char temp = str.charAt(i);//a

            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);//a:1, s:1
            }

        }

        System.out.println(map);

        Set<Map.Entry<Character, Integer>> entry = map.entrySet();
        for (Map.Entry<Character, Integer> e : entry) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }
}
