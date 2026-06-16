package constructorStudy;

public class B {
    int a ;//variable declaration-->global variable
    int b ;//variable declaration-->global variable

    public B()//user defined constructor
    {
        a = 10;
        b = 20;
        System.out.println("value of a is "+a);
        System.out.println("value of b is "+b);
    }
    public B(int x, int y) {
        a = x;//8,100
        b = y;//2,1
        System.out.println("value of a is "+a);
        System.out.println("value of b is "+b);
    }
    public static void main(String[] args) {
        B b = new B();//a=10,b=20
        b.add();
        B b1= new B(8,2);
        b1.add();
        B b2= new B();
        b1.c();
        B b3= new B(400,99);
        b3.add();
    }

    public void add() {
        int sum = a + b;//10,20    //8,2
        System.out.println("sum is " + sum);
    }

    public void c()
    {
        System.out.println("value of a is "+a);
        System.out.println("value of b is "+b);
    }


}
