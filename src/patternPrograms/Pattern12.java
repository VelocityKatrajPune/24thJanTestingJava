package patternPrograms;

public class Pattern12 {
    public static void main(String[] args) {
//           *
//          ***
//         *****
//        *******
//         *****
//          ***
//           *

        int row = 7;
        int space = 3;
        int star = 1;

        //outer for loop-->row
        for (int i = 1; i <= row; i++) {
            //inner for loop1-->space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //inner for loop2-->star
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < 4) {
                star = star + 2;
                space--;
            } else {
                star = star - 2;
                space++;
            }

        }


    }
}
