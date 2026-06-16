package patternPrograms;

public class Pattern10 {
    public static void main(String[] args) {
//        *****
//        ****
//        ***
//        **
//        *
//        **
//        ***
//        ****
//        *****

        //row col star
        int row = 9;
        int star = 5;

        //outer for --> row
        for (int i = 1; i <= row; i++) {
            //inner for loop col-> star
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < 5) {
                star--;
            } else {
                star++;
            }
        }


    }
}
