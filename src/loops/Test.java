package loops;

public class Test {
    public static void main(String[] args) {

        int a=100;
        a++;        //a=a+1;
        System.out.println("a:"+a);
        System.out.println("================");

        int m=8;
        System.out.println("m:"+m);
        int x=m++;//post increment
        System.out.println("================");
        System.out.println("x:"+x);
        System.out.println("m:"+m);
        System.out.println("================");
        int n=10;
        System.out.println("n:"+n);
        System.out.println("================");
        int y=++n;//pre increment
        System.out.println("n:"+n);
        System.out.println("y:"+y);
    }
}
