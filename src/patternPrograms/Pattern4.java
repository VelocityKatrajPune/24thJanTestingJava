package patternPrograms;

public class Pattern4 {
    public static void main(String[] args) {
//        *****
//         ****
//          ***
//           **
//            *

// row    col stars in 1st line space in 1st line

        int row = 5;
        int col = 5;
        int space = 0;
        int star = 5;

        //outer for loop-->row
        for (int i = 1; i <= row; i++) {//1,2
            //inner for loop1-->space
            for (int j = 1; j <= space; j++) {//0
                System.out.print(" ");
            }
            //inner for loop 2-->stars
            for (int k = 1; k <= star; k++) {//1,2..5
                System.out.print("*");
            }
            System.out.println();
            space++;//1,2
            star--;//4,3
        }


    }
}
