package polymorphism;

public class B extends A {

    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        b.addition();

    }

    public void addition() {
        int c = 10;
        int d = 20;
        int sum = c + d;
        System.out.println("addition is " + sum);
    }

    public  void addition(String a)
    {

    }
}
