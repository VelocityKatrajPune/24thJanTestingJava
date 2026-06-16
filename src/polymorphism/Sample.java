package polymorphism;

public class Sample {

    public static void main(String[] args) {
        main();
        main("Katraj");
    }

    public static void main()
    {
        System.out.println("main method overloaded without parameter");
    }

    public static void main(String city)
    {
        System.out.println("main method overloaded with parameter "+city);
    }

    public void a()
    {
        System.out.println("non static method a");
    }

    public static void a(int x)
    {
        System.out.println(" static method a with int para "+x);
    }

    private void b()
    {
        System.out.println("non static method b");
    }

//    private String b()
//    {
//        String a="test";
//        return  a;
//    }

    private void b(float c)
    {
        System.out.println("non static method b "+c);
    }


}
