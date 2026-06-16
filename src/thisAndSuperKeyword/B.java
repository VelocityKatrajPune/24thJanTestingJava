package thisAndSuperKeyword;

public class B extends A {
    int x = 999;//global variable from B class
    int y = 8;
    //x

    public static void main(String[] args) {
        B b = new B();
        b.display();
        A a = new A();
        a.display();
    }

    public void display() {
        System.out.println("hi");
    }

    public void show() {
        int x = 120;
        int sum1 = x + 1;//local value of x is used
        System.out.println(sum1);

        int sum2 = this.x + 1;//global value of x form same class
        System.out.println(sum2);

        int sum3 = super.x + 1;//global value of x from super class
        System.out.println(sum3);

        int sum4 = y + 1;
        System.out.println(sum4);

    }


}
