package patternPrograms;

public class Pattern8 {
    public static void main(String[] args) {
//           *
//          * *
//         * * *
//        * * * *
        //row   col  1st line space 1st line stars
        int row = 4;
        int space = 3;
        int star = 1;

        //outer for -->row
        for (int i = 1; i <= row; i++) {
            //space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //star
            for (int k = 1; k <= star; k++) {
                System.out.print("* ");
            }
            System.out.println();
            star++;
            space--;
        }


    }
}
