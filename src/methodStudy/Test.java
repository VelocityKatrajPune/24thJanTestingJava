package methodStudy;

public class Test {
    public static void main(String[] args) {
    Test test= new Test();
    test.a();
    test.a("Mumbai");
    test.a("Nagpur");
    }

    public void a()
    {
       System.out.println("Pune");
    }

    public void a(String city)
    {
        System.out.println(city);
    }
}
