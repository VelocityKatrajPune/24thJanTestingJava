package exceptionStudy;

public class Exception5 {
    public static void main(String[] args) {

        String a = null;
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("/ by zero not possible");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("check String index");
        } catch (NullPointerException e) {
            System.out.println("check object, should not be null");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println("hello program over");

    }
}
