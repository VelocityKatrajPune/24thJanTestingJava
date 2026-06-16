package logicalProgram;

import java.util.Scanner;

public class ReverseStringUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter String to be reversed");
        String givenString = scanner.next();
        String revString = "";

        for (int i = givenString.length() - 1; i >= 0; i--) {
            char temp = givenString.charAt(i);
            revString = revString + temp;
        }
        System.out.println("given String is " + givenString);
        System.out.println("reverse String is " + revString);


    }
}
