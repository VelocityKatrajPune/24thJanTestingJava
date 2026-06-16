package constructorStudy;

public class C {
    int x=2;//global variable
    int y=2;//global variable

    public static void main(String[] args) {
        C c1 = new C();
        c1.addition();//10
        C c2 = new C(1, 99);
        c2.addition();//100
        C c3= new C(100,500);
        c3.addition();//600
    }

    public C() {
        x = 7;
        y = 3;
    }

    public C(int p, int q) {
        x = p;//1
        y = q;//99
    }

    public void addition() {
        int sum = x + y;
        System.out.println("sum is " + sum);
    }

}
