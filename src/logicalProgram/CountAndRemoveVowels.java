package logicalProgram;

import java.util.Scanner;

public class CountAndRemoveVowels {
    public static void main(String[] args) {
        //vowels= a e i o u
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String");
        String givenString1 = scanner.next();
        String givenString = givenString1.toLowerCase();
        String output = "";
        int count = 0;
        for (int i = 0; i <= givenString.length() - 1; i++) {
            char temp = givenString.charAt(i);
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
                count++;
                System.out.println("vowel found is " + temp+ " index is "+i);
                continue;
            }
            output = output + temp;//    vl
        }

        System.out.println("String without vowels is " + output);
        System.out.println("Number of vowels in String are " + count);

    }
}
