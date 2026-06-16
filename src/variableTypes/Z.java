package variableTypes;

public class Z {
    int a = 1;//global variable
    static int b = 2;//static variable

    public static void main(String[] args) {

    }

    public void add() {
        int a = 10;//local variable
        //int b=2;
        //  static int d=11; static variable never be local
        int sum = a + 10;//used local value of a-->10
        System.out.println(sum);
        int sum1 = this.a + 10;//used global value of a-->1
        System.out.println(sum1);
        int sum2 = b + 10;//used static variable a
        System.out.println(sum2);
    }

    public static void sub() {
        int a = 9;//local variable
        int b=12;
        int sub = a - 10;
        System.out.println(sub);
        //  int sub1=this.a-10; in static method never refer global variables
        int sub1 = Z.b - 10;//static method can refer static variables

    }

}
