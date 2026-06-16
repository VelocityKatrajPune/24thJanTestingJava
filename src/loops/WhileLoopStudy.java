package loops;

public class WhileLoopStudy {
    public static void main(String[] args) {
        //I want to print Velocity 5 times
        String test = "velocity";
        //initialization=1      condition<=5   updation ++
        int a = 1;//initialization
        while (a <= 5)//condition//1,2,3
        {
            //body
            System.out.println(test);
            //updation
            a++;//2,3,5,6
        }
        System.out.println("============");
// I want to print table of 3
        //initialization=3      condition<=30   updation +3
        int x = 3;
        while (x <= 30) {
            System.out.println(x);
            x = x + 3;
        }
        System.out.println("============");
// I want to print table of 3 in reverse order
        //initialization=30      condition>=3   updation -3
        int y = 30;
        while (y >= 3) {
            System.out.println(y);
            y = y - 3;
        }


    }
}
