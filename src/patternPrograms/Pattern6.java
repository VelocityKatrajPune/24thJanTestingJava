package patternPrograms;

public class Pattern6 {
    public static void main(String[] args) {
//        *******
//         *****
//          ***
//           *

        //row   col  1st line space 1st line stars
        int row = 4;
        int col = 7;
        int space = 0;
        int star = 7;
        for (int i = 1; i <= row; i++) {
            //space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //star
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();
            star = star - 2;
            space++;
        }


    }
}
