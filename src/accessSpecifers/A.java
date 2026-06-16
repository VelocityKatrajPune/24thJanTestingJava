package accessSpecifers;

public class A {
    //private
    //default
    //protected
    //public

    private int l = 10;
    int m = 20;
    protected int n = 30;
    public int o = 40;


    public static void main(String[] args) {

        A a = new A();

        a.test1();
        a.test2();
        a.test3();
        a.test4();
        int sum1 = 1 + a.l;
        int sum2 = 1 + a.m;
        int sum3 = 1 + a.n;
        int sum4 = 1 + a.o;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);


    }

    private void test1() {
        System.out.println("A's private method test1");
    }

    void test2() {
        System.out.println("A's default method test2");
    }

    protected void test3() {
        System.out.println("A's protected method test3");
    }

    public void test4() {
        System.out.println("A's public method test4");
    }


}
