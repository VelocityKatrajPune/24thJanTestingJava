package patternPrograms;

public class Pattern5 {
    public static void main(String[] args) {
//            *
//           **
//          ***
//         ****
//        *****

        //row   col  1st line space 1st line stars
        int row = 5;
        int col = 5;
        int space = 4;
        int star = 1;

        //outer for loop-->row
        for (int i = 1; i <= row; i++) {
            //inner for loop1-->space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //inner for loop 2
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();
            star++;
            space--;
        }


    }
}
