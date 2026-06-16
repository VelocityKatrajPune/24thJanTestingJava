package accessSpecifers;

   class Test {

           Test() {
               this(10);
               System.out.print("Default ");
           }

           Test(int x) {
               System.out.print("Param ");
           }

           public static void main(String[] args) {
               new Test();
           }

}
