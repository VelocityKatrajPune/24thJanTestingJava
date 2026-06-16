package patternPrograms;

public class Pattern2 {
    public static void main(String[] args) {
//        *
//        **
//        ***
//        ****
//        *****

        //row    col stars in 1st line space

        int row = 5;
        int col = 5;
        int star = 1;//-->2-->3

        //outer for loop-->row
        for (int i = 1; i <= row; i++) {//i=1
            //inner for loop-->col
            for (int j = 1; j <= star; j++) {//j=1,2,3
                System.out.print("*");
            }
            System.out.println();
            star++;
        }


    }
}
