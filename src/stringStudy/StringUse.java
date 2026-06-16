package stringStudy;

public class StringUse {
    public static void main(String[] args) {
      //  A a= new A();
        String city="Pune";//------>1-->constant pool
        System.out.println(city);
        //  A a= new A();
        String country= new String("India");//---->2-->non constant pool
        System.out.println(country);




    }


}
