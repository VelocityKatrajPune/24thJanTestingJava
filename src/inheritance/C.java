package inheritance;

public class C extends B{
    int m=40;
    static int n=50;
    public void display3() {
        System.out.println("C class display3 method-non static");
    }

    public static void show3() {
        System.out.println("C class show3 method-static");
    }
}
