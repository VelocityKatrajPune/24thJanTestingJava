package abstractClass;

public abstract class B {
    public static void main(String[] args) {
//        B b= new B();
//        b.show1();
//        b.show2();
//        b.show3();
        D d= new D();
        d.show3();
    }

    public void show1() {
        System.out.println("show 1method implemented in B class");
    }

    public void show2() {
        System.out.println("show 2 method implemented in B class");
    }

    public abstract void show3();

    public abstract void show6();

    public abstract void show7();

    public abstract void show(String a);

}
