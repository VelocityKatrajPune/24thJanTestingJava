package methodStudy;
public class MethodReuse {
    public static void main(String[] args) {
        MethodReuse methodReuse = new MethodReuse();//created object of a class
        methodReuse.addition();//calling method without parameter
        methodReuse.addition(1, 1);//calling method with two parameters
        methodReuse.addition(22);//calling method with one parameter
    }
    public void addition()//non static method
    {        //method without parameters        //zero parameter method
        int a = 10;
        int b = 1;
        int sum = a + b;
        System.out.println("sum is " + sum);
    }
    public void addition(int a, int b) {  //method with parameters    //two parameters method
        int sum = a + b;
        System.out.println("sum is " + sum);
    }
    public void addition(int a) {        //single parameter method
        int sum = 100 + a;
        System.out.println("sum is " + sum);
    }
}
