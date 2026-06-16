package patternPrograms;

public class Pattern1 {
    public static void main(String[] args) {
//        *****
//        *****
//        *****
        //row     columns   stars in 1st line  space
        int row = 3;  //outer--> row
        int col = 5;  //inner-->col

        //outer for loop-->rows
        for (int i = 1; i <= row; i++) {
            //inner for loop-->col
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
