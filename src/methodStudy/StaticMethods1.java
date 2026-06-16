package methodStudy;

public class StaticMethods1 {
    public static void main(String[] args) {
        // to call static methods from same class
        //call with methodName();
        System.out.println("this is main method");
        a();
//calling static method from another class
// className.methodName();
        StaticMethods2.b();//called static regular method from another class
        StaticMethods2.c();
        StaticMethods2.a();

    }

    public static void a()//static regular method
    {
        System.out.println("This is static regular method -->a");
    }
}
