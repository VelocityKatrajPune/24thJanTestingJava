package logicalProgram;

public class FibonacciSeries {
    public static void main(String[] args) {
        //0, 1, 1, 2, 3, 5, 8, 13, 21
        int number = 15;
        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= number; i++) {//1
            System.out.print(num1 + "  ");//0,1
            int sum = num1 + num2;//1,2
            num1 = num2;//1,1
            num2 = sum;//1,2
        }


    }
}
