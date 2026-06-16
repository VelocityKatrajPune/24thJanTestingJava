package abstractClass;

public class C extends B {
    public static void main(String[] args) {
        C c = new C();
        c.show1();
        c.show2();
        c.show3();
        c.show4();
        c.show5();
        c.show6();
        c.show("Pune testing");
    }

    @Override
    public void show3() {
        System.out.println("show 3 method implemented in C class");
    }

    @Override
    public void show6() {
        System.out.println("show 6 method implemented in C class");
    }

    @Override
    public void show7() {

    }

    @Override
    public void show(String a) {
        System.out.println("Parameter value is" +a);

    }

    public void show4() {
        System.out.println("show 4 method implemented in C class");
    }

    public void show5() {
        System.out.println("show 5 method implemented in C class");
    }

}
