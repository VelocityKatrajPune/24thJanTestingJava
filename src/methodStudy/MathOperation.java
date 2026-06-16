package methodStudy;
public class MathOperation {
    public static void main(String[] args) {
        //created object of class
        MathOperation mathOperation = new MathOperation();
        mathOperation.addition();//calling non static method
        sub();//calling static method
        // calling non static method from another class
        // created object of another class
        B b= new B();
        b.mul();//calling non static method from another class
        B.div();//calling static method from another class
    }
    public void addition() {
        int a;//variable declaration
        a = 10;//variable assignment
        int b = 20;//variable declaration+assignment
        int sum = a + b;
        System.out.println("sum is " + sum);
    }
    public static void sub() {
        int x = 8;//variable declaration+assignment
        int y = 1;//variable declaration+assignment
        int sub = x - y;
        System.out.println("sub is " + sub);
    }

}
