package ArrayStudy;

import java.util.Arrays;

public class ArraySample2 {
    public static void main(String[] args) {
        int rollNum[] = {2, 6, 21, 34, 8, 9, 3, 7, 65};
        //System.out.println(rollNum[3]);
        System.out.println("=============================");
        for (int i = 0; i <= rollNum.length - 1; i++) {
            System.out.println(rollNum[i]);
        }
        System.out.println("=============================");
        Arrays.sort(rollNum);
        for (int i = 0; i <= rollNum.length - 1; i++) {
            System.out.println(rollNum[i]);
        }
        System.out.println("=============================");
        for (int i = rollNum.length - 1; i >= 0; i--) {
            System.out.println(rollNum[i]);
        }

        System.out.println("=============================");
        String names[]={"sachin","sourabh","rahul","yuvraj"};
        char classRooms[]={'a','b','c','d','e'};
        int test[] = {2, 6, 21, 34, 8, 9, 3, 7, 65};
        System.out.println("=============================");
    }
}
