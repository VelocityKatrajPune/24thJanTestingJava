package patternPrograms;

public class Pattern7 {
    public static void main(String[] args) {
//           *
//          ***
//         *****
//        *******

        //row   col  1st line space 1st line stars
        int row = 4;
        int col = 7;
        int space = 3;
        int star = 1;

        //outer-->row
        for (int i = 1; i <= row; i++) {
            //space
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star = star + 2;
            space--;

        }


    }
}
