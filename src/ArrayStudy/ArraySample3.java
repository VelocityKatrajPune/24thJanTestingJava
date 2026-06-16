package ArrayStudy;

public class ArraySample3 {
    public static void main(String[] args) {

        int test[][] = new int[2][2];//array declaration

        //array initialization
        test[0][0] = 5;
        test[0][1] = 10;
        test[1][0] = 15;
        test[1][1] = 20;

        //array usage
        //System.out.println(test[1][0]);

        //row--> outer for loop
        for (int i = 0; i <= test.length - 1; i++)//0,1,2
        {
            // columns-->inner for loop
            for (int j = 0; j <= test.length - 1; j++)//0,1,2
            {
                System.out.print(test[i][j] + "   ");//1,0  1,1
            }
            System.out.println();
        }


    }
}
