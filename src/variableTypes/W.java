package variableTypes;

public class W {
    int a = 9;//non-static global variable
    static int b = 10;//static global variable

    public static void main(String[] args) {
        W w = new W();
        int sub = w.a - 1;//used global non static variable from same class
        //call with object reference
        System.out.println(sub);
        int sub1 = b - 1;//used global static variable from same class
        //direct call as static variable belongs to same class
    }
}
