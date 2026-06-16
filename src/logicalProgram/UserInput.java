package logicalProgram;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //System.out.println();
        //scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.next();
        System.out.println("entered name is " + name);
        System.out.println("============================");
        System.out.println("Please enter your rollNum");
        int rollNum = scanner.nextInt();
        System.out.println("entered roll number is " + rollNum);
        System.out.println("============================");
        System.out.println("Please enter your marks");
        float marks = scanner.nextFloat();
        System.out.println("entered marks are " + marks);
        System.out.println("============================");
    }
}
