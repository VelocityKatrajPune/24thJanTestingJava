package casting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ClassCastingStudy {
    public static void main(String[] args) {

        Father father = new Father();
        father.car();
        father.bike();
        System.out.println("================");
        Son son = new Son();
        son.car();
        son.bike();
        son.education();
        System.out.println("================");

        Father son1 = new Son();
        son1.car();
        son1.bike();
        // son1.education();
        son1.nature();


      //  Son s= new Father();




      //  WebDriver driver= new ChromeDriver();

        List<Integer>l= new ArrayList<>();
        l.add(12);

        Iterator<Integer> lt = l.iterator();



    }
}
