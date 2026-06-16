package stringStudy;

public class StringMethods {
    public static void main(String[] args) {
        String a2 = null;
        //  System.out.println(a2.length());
        String a = "Velocity";
        //1. length()
        System.out.println(a.length());//It will not store the value
        int stringLength = a.length();
        System.out.println("length of string is " + stringLength);
        String a1 = "";
        System.out.println(a1.length());
        System.out.println("=======================");
//        2. touppercase()
//        3. toLowerCase()
        String b1 = "Testing";
        String b2 = b1.toUpperCase();
        System.out.println(b2);
        System.out.println(b2.toLowerCase());
        System.out.println("=======================");
//        4. equals()  5. equalsIgnoreCase()  // ==
        String c1 = "Pune";
        String c2 = "Pune";
        String c3 = new String("Pune");
        String c4 = new String("Pune");
//        System.out.println(c1.equals(c2));
//        System.out.println(c1.equalsIgnoreCase(c2));

        System.out.println(c1 == c4);
        System.out.println(c1 == c2);
        System.out.println(c3 == c4);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c3.equals(c4));
        System.out.println("=======================");

        //  6. contains()
        String d1 = "Katraj";
        boolean result = d1.contains("tj");//j//aj //traj
        System.out.println(result);
//        String d2=null;
//        d2.contains("t");
        String d3 = "";
        System.out.println(d3.contains("t"));
        System.out.println("=======================");
        //7. isEmpty()
        System.out.println(d3.isEmpty());
        System.out.println(d1.isEmpty());
        System.out.println(d3.isBlank());
        System.out.println("=======================");

        String e1 = " ";
        String e2 = "";
        String e3 = null;
        String e4 = "test";
        System.out.println(e1.length());
        System.out.println(e2.length());
        System.out.println(e4.length());
        System.out.println(e1.isEmpty());
        System.out.println(e2.isEmpty());
        System.out.println(e1.isBlank());
        System.out.println(e2.isBlank());
        System.out.println(e4.isEmpty());
        String e5 = "                    ";
        //  System.out.println(e5.isEmpty());
        System.out.println(e5.isBlank());

        System.out.println("=======================");
        //   8. charAt
        String f1 = "Velocity Testing";
        System.out.println(f1.charAt(9));
        System.out.println(f1.charAt(8));
        //System.out.println(f1.charAt(-1));
        System.out.println("=======================");
//        9. endsWith
//        10. startsWith
        String g1 = "Selenium";
        String g2 = "java";
        String g3 = "testing";
        String g4 = "";
        System.out.println(g1.endsWith("m"));
        System.out.println(g1.endsWith("elenium"));
        System.out.println(g1.endsWith("ni"));
        System.out.println("=======================");
        System.out.println(g1.startsWith("Sel"));
        System.out.println(g1.startsWith("el"));
        System.out.println("=======================");

//        11. substring
        String h1 = "Velocity Corporate Training Center";
        String h2 = h1.substring(9);
        System.out.println(h2);

        String h3 = h1.substring(19, 27);
        System.out.println(h3);

        String h4 = "testing";
        //est
        System.out.println(h4.substring(1, 4));
        System.out.println("=======================");

        //12. concat
        String i1 = "Java";
        String i2 = "Testing";

        String i3 = i1.concat(i2);
        System.out.println(i3);

        System.out.println(i1.concat(" ").concat(i2));
        System.out.println(i1.concat(" ").concat("Selenium ").concat(i2));
        System.out.println("=======================");

        //13. indexOf
        //14. lastIndexOf

        String j1 = "pune";
        int index = j1.indexOf('n');
        System.out.println(index);

        String j2 = "testing";
        System.out.println(j2.indexOf('t'));
        System.out.println(j2.lastIndexOf('t'));

        String j3 = "enginieeeringe";
        System.out.println(j3.indexOf('i', 4));
        System.out.println(j3.indexOf("in"));
        System.out.println(j3.indexOf('e', 7, 9));
        System.out.println("=======================");
        //15. replace
        String k1 = "testing";
        System.out.println(k1.replace('t','b'));

        String k2="engineering";
        System.out.println(k2.replace("in","ytt"));

        System.out.println(k2.replaceFirst("in","uu"));
        System.out.println(k2.replaceAll("in","oo"));


        System.out.println("========================================");

        String l="Java selenium Study";//"Java_selenium_Study";
        String[] result4 = l.split(" ");
        System.out.println(result4.length);






    }
}
