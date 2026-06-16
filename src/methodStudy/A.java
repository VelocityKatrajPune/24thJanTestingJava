package methodStudy;
public class A {
    public static void main(String[] args) {
        test3();//calling static method from same class
        //to call non static regular method we need to create object
        //ClassName objectName= new ClassName();
        A a = new A();
        //objectName.methodName();
        a.test1();//calling non static method from same class
        a.test2();//calling non static method from same class
        NonStaticMethods1 nonStaticMethods1= new NonStaticMethods1();
        nonStaticMethods1.myMethod1();
    }

    public void test1(){ //non static regular method
        System.out.println("non static method test1 from class A");
    }

    public void test2() {//non static regular method
        System.out.println("non static method test2 from class A");
    }

    public static void test3() {// static regular method
        System.out.println("static method test3 from class A");
    }
    public void display(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }
    public static void display(String name, int rollNum) {
        System.out.println("my name is " + name);
        System.out.println("my roll num is " + rollNum);
    }
}
