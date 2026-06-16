package interfaceStudy;

 class FinalStudy {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(a);
        a = a + 1;
        System.out.println(a);

        final int b = 9;
        System.out.println(b);
        // b = b + 1;
        //  System.out.println(b);
    }

    public void test1() {
        System.out.println("test1 method from FinalStudy class");
    }

     void test2() {
        System.out.println("test2 method from FinalStudy class");
    }

    private void test3() {
        System.out.println("test3 method from FinalStudy class");
    }


}
