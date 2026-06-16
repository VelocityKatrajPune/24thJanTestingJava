package variableTypes;

public class V {
    public static void main(String[] args) {
        W w = new W();// created object of W (another) class
        //calling global variable from W class in V class using object reference
        int mul = w.a * 2;
        System.out.println(mul);
        //calling static global variable from W class in V class using class reference
        int div = 100 / W.b;
        System.out.println(div);
    }
}
