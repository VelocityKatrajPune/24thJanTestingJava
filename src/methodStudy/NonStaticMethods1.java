package methodStudy;

public class NonStaticMethods1 {
    public static void main(String[] args) {
    // to call non-static method, we need object of calss
    NonStaticMethods1 nonStaticMethods1 = new NonStaticMethods1();
    nonStaticMethods1.myMethod1();//called non static method from same class
    // to call non static method from another class-->
        // create object of that class
        // created object of another class
    NonStaticMethods2 nonStaticMethods2 = new NonStaticMethods2();
        //calling non static method from another class
    nonStaticMethods2.myMethod2();
    }

    public void myMethod1()//non static method
    {
        System.out.println("Non static myMethod1");
    }

}
