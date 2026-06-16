package constructorChaining;

public class X {

    public X() {
    //    this(10);
        System.out.println("user defined without parameter constructor from X class");
    }

    private X(int a) {
        this("test");
        System.out.println("user defined with single parameter constructor from X class");
        System.out.println(a);
    }

    public X(String a) {
        System.out.println("user defined with single parameter constructor from X class");
        System.out.println(a);
    }

    public static void main(String[] args) {
        X x = new X();
    }
}
