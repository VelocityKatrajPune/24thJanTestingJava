package variableTypes;

public class Y {
    int a = 90;//8;//global variable

    public static void main(String[] args) {
        Y y = new Y();
        y.mul();

        Y y1 = new Y();
        y1.sub();

    }

    public void mul() {
        a = 8;
        int mul = a * 10;
        System.out.println(mul);
    }

    public void sub() {
        int sub = a - 10;
        System.out.println(sub);
        int sub1 = this.a - 10;
        System.out.println(sub1);
    }

}
