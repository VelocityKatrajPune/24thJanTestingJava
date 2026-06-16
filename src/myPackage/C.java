package myPackage;

import accessSpecifers.A;

public class C extends A {

    public static void main(String[] args) {
        A a= new A();
       // a.test1();
       // a.test2();
      //  a.test3();
        a.test4();

        C c= new C();//created object of sub class
        c.test3();//protected method from A class
        c.test4();//public method from A class
    }


}
