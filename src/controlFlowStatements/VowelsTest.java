package controlFlowStatements;

public class VowelsTest {
    public static void main(String[] args) {
        //A,E,I,O,U-->vowels
        //not out of above -->consonants
        char input = 'Z';
        if (input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U') {
            System.out.println("given char is vowels");
        } else {
            System.out.println("given char is consonants");
        }


    }
}
