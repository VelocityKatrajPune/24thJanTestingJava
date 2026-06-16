package loops;

public class Increment {
    public static void main(String[] args) {
        int x=10;
        int y=99;

        //post and pre increment
        System.out.println(x);
       int a=x;
        System.out.println("x-->"+x);
        System.out.println("a-->"+a);
        System.out.println("======================");
        int b=x++;//post increment
        System.out.println("x-->"+x);
        System.out.println("b-->"+b);
        System.out.println("======================");
        System.out.println("y-->"+y);
        int c=++y;//pre increment
        System.out.println("y-->"+y);
        System.out.println("c-->"+c);

    }
}
