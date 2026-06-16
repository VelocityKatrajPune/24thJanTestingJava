package patternPrograms;

public class Pattern13 {
    public static void main(String[] args) {
//*         *
//**       **
//***     ***
//****   ****
//***** *****
//****   ****
//***     ***
//**       **
//*         *


        int row = 9;
        int star1 = 1;
        int space1 = 4;
        int star2 = 1;
        int space2 = 5;

        //outer for loop

        for (int i = 1; i <= row; i++) {
            //inner for loop1 -->star1
            for (int j = 1; j <= star1; j++) {
                System.out.print("*");
            }
            //inner for loop2-->space1
            for (int k = 1; k <= space1; k++) {
                System.out.print(" ");
            }
            //inner for loop 3-->space2
            for (int l = 1; l <= space2; l++) {
                System.out.print(" ");
            }
            //inner for loop 4-->star2
            for (int m = 1; m <= star2; m++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < 5) {
                star1++;
                star2++;
                space2--;
                space1--;
            } else {
                star1--;
                star2--;
                space1++;
                space2++;
            }

        }


    }
}
