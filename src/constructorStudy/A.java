package constructorStudy;
public class A {
    //public A()
//{
//    default constructor
//}
    //constructor-->special method     //constructor name -->same as className
    //constructor-->doesnt have return type(void)
    public A() {
        //user defined constructor(zero parameter)        //constructor will be called automatically?
        //when we create object of a class
        System.out.println("called user defined constructor-zero parameter");
    }
    public A(int a) {
        System.out.println("called user defined constructor-single parameter");
    }
    public static void main(String[] args) {
        A a = new A(12);// calling constructor-single parameter
        A a1 = new A();//calling constructor-zero parameter

    }


}
