package logicalProgram;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "1234";//"test";//"java";//aajv
        String s2 = "4321";//"best";//"avaj";//aajv

        char[] ar1 = s1.toCharArray();//  {'j','a','v','a'}
        char[] ar2 = s2.toCharArray();//{'a','v','a','j'}

        Arrays.sort(ar1);//{'a','a','j','v'}
        Arrays.sort(ar2);//{'a','a','j','v'}

        if (Arrays.equals(ar1, ar2)) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Strings are not anagram");
        }

    }
}
