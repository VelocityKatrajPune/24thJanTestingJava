package abstractClass;

public class Demo2 extends Demo1 {

    public Demo2() {
        System.out.println("constructor of Demo2");
    }

    public static void main(String[] args) {
        // Demo1 d1= new Demo1();
        Demo2 demo2 = new Demo2();
    }

    @Override
    public void a1() {
        System.out.println("Demo1 a1 completed in Demo2");
    }

}
