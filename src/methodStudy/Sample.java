package methodStudy;

public class Sample {

    public static void main(String[] args) {
        //how to call static methods from same class
        //call by method name only
        d();//calling static method from same class
    }
    public void a() //non static method declaration-->  this is complete method
    {
//body-->definition
    }
    public void b()//non static method declaration -->this is complete method
    {
        //body-->definition
        System.out.println("hi");
        System.out.println("hello");
    }
    //   public void c(); //method declaration--> this is incomplete method


    public static void d() {//complete static regular
        System.out.println("gn all");
    }

    //  public static void e();//method declaration static regular incomplete method


}
