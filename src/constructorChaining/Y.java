package constructorChaining;

public class Y extends X {

    public Y() {
        //  this("Pune");//calling same class constructor
        System.out.println("user defined without parameter constructor from Y class");
    }

    public Y(String w) {
        super(); //calling super class without parameter constructor
        System.out.println("user defined with parameter constructor from Y class");
        System.out.println(w);
    }

    public static void main(String[] args) {
        Y y = new Y("kk");
    }

}
