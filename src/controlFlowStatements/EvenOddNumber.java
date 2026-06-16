package controlFlowStatements;

public class EvenOddNumber {
    public static void main(String[] args) {
        //what is even-->divide 2-->remainder==0
        //what is odd
//        System.out.println(9/2);//4
//        System.out.println(9%2);//1

        int number = 4;
        if (number % 2 == 0) {
            System.out.println("given number is even");
        } else {
            System.out.println("given number is odd");
        }

    }
}
