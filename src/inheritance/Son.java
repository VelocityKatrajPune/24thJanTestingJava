package inheritance;

public class Son  extends Mother{
    String colour = "xyz";

    public void weight() {
        System.out.println("Sons weight");
    }

    public static void hobbies() {
        System.out.println("Sons hobbies");
    }

    public static void main(String[] args) {


        Son son= new Son();
        son.weight();
        son.nature();
        height();
        hobbies();
    }
}
