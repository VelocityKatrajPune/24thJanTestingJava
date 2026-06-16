package polymorphism;

public class A {
    public static void main(String[] args) {
        A a= new A();
        a.addition(20);
        a.addition(9);
        a.addition(8.8f);

    }

    public void addition() {
        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println("addition is " + sum);
    }

    public void addition(int a) {
        int sum = a + 1;
        System.out.println("addition is " + sum);
    }
    public void addition(float a) {
        float sum = a + 1;
        System.out.println("addition is " + sum);
    }
}
