package patternPrograms;

public class Pattern11 {
    public static void main(String[] args) {
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
        int row = 9;
        int star = 1;

        //outer for loop-->row
        for (int i = 1; i <= row; i++) {
            //inner for loop for col-->star
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < 5) {
                star++;
            } else {
                star--;
            }
        }
    }
}
