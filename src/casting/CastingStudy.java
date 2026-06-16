package casting;

public class CastingStudy {

    public static void main(String[] args) {

        byte a=10;//   1byte
        System.out.println(a);

        //implicit casting
        //lower-->higher
        //memory-->increase -->widening casting
        //No data loss

//        int b=a; //4 byte
//        System.out.println(b);

        double c=a;// 8 byte
        System.out.println(c);


        //Explicit Casting
        //higher-->lower
        //memory-->decrease -->narrowing casting
        //possible data loss
        System.out.println("================");
        double m=12.921;  // 12.56577
        System.out.println(m);
        short n= (short) m;
        System.out.println(n);

    }
}
