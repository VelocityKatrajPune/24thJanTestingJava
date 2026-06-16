package interfaceStudy;

import abstractClass.D;

public class Demo extends  FinalStudy
{
    public static void main(String[] args) {

        Demo demo= new Demo();
        demo.test2();
        demo.test1();
       // demo.test3();
    }
    public void test1()
    {
        System.out.println("test1 method from Demo class");
    }

    public void test2()
    {
        System.out.println("test2 method from Demo class");
    }


}
