package patternPrograms;

public class Pattern3 {
    public static void main(String[] args) {
//        *****
//        ****
//        ***
//        **
//        *

        //row    col stars in 1st line space
        int row = 5;
        int col = 5;
        int star = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star--;
        }

    }
}
