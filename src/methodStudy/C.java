package methodStudy;

public class C {
    public  static void main(String[] args) {

        C c = new C();//created object of class
       display("Velocity",99);
       A.display("Katraj",88);
       c.display(1,2);
       c.display(88,"Pune");
       A a= new A();
       a.display(12,11);
    }
    public static void display(String name, int rollNum) {
        System.out.println("my name is " + name);
        System.out.println("my roll num is " + rollNum);
    }
     public void display(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }
    public void display(int rollNum, String name) {
        System.out.println("my roll num is " + rollNum);
        System.out.println("my name is " + name);
    }

}
