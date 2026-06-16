package inheritance;

public class MultiLevelInheritance {

    public static void main(String[] args) {
        //without inheritance
        A a = new A();
        B b = new B();
        C c = new C();
        a.display1();
        b.display2();
        c.display3();

        A.show1();
        B.show2();
        C.show3();
        System.out.println("==========================");

        c.display1();
        c.display2();
        c.display3();
        int sum1 = 10 + c.x + c.m + c.p;
        int sub = 100 - C.n + C.q + C.y;


        C.show1();
        C.show2();
        C.show3();
    }
}
