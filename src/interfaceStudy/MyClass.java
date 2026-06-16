package interfaceStudy;

public class MyClass implements MyInterface {

    public static void main(String[] args) {
        MyClass myClass= new MyClass();
        myClass.test1();
        myClass.test2();
    }

    @Override
    public void test1() {
        System.out.println("interface method completed in implementation class");
    }

    @Override
    public void test2() {
        System.out.println("interface method completed in implementation class");
    }

    @Override
    public void test4() {

    }
    public void test3() {
        System.out.println("own method from myclass");
    }
}
