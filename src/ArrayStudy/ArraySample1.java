package ArrayStudy;

import java.util.Arrays;

public class ArraySample1 {
    public static void main(String[] args) {

        //I want to store my rollNum
//        int rollNum[]= new int[10];
        //I want to store batters names

        String batters[] = new String[5];  //Array Declaration

        batters[0] = "Ishan";  //Array initialization
        batters[1] = "Shubhman";
        batters[2] = "Rohit";
        batters[3] = "Virat";
       // batters[4] = "Surya";
        // batters[8] = "Hardik";

        //System.out.println(batters);
        System.out.println(batters[1]);//Array Usage
        System.out.println(batters[3]);
        System.out.println(batters[4]);
        System.out.println("================================");
        System.out.println(batters.length);
        System.out.println("============Normal order==============");
        // ini =0   condition=maxIndex; length-1 updation=+1
        for (int i = 0; i <= batters.length - 1; i++)//0
        {
            System.out.println(batters[i]);
        }
        System.out.println("==============Ascending sorted===============");
        Arrays.sort(batters);
        for (int i = 0; i <= batters.length - 1; i++) {
            System.out.println(batters[i]);
        }
        System.out.println("============Descending sorted=============");
        for (int i = batters.length - 1; i >= 0; i--) {
            System.out.println(batters[i]);
        }

    }
}
