package stringStudy;

public class StringBufferBuilderStudy {
    public static void main(String[] args) {
        String name = "Velocity";
        String name1 = name.replace("V", "v");
        System.out.println(name);
        System.out.println(name1);


        StringBuffer city = new StringBuffer("Mumbai");
        System.out.println(city);
        city.replace(0, 1, "m");
        System.out.println(city);
        //sync-->thread safe-->per-->low

        //non-sync->thread not safe-->per-->improve
        System.out.println(city.reverse());


        System.out.println("==========================");

        StringBuffer gender = new StringBuffer("Male");
        gender.append(" Gender");
        System.out.println(gender);
        gender.insert(0, "Test");
        System.out.println(gender);
        gender.delete(0, 4);
        System.out.println(gender);

        StringBuilder balance = new StringBuilder("12345");


    }
}
