package variableTypes;

public class X {
    int a = 100;//global variable
    int b = 99;
    int d;


    public static void main(String[] args) {
        X x = new X();
        x.display();
    }
    public void display() {
            int a =9; //local variable
        int sum = a + b;//used local value of a
        System.out.println("sum is " + sum);
        int sum1 = this.a + b;//calling global value a
        System.out.println("sum is " + sum1);
        int c=90;//local variable
        System.out.println("C value  is " + c);
        System.out.println("d value  is " + d);
    }
    public void show()
    {
        int c=77;//local variable
        int a=5;
        int sub=c-this.a-b;
    }
}
