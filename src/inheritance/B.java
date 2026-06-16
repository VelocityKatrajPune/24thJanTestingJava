package inheritance;

public class B extends A{
    int p=20;
    static int q=30;
    public void display2() {
        System.out.println("B class display2 method-non static");
    }

    public static void show2() {
        System.out.println("Bclass show2 method-static");
    }
}
