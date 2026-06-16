package loops;

public class ForLoopStudy {
    public static void main(String[] args) {

        //I want to print msg 5 times
        //start=1   updation=++   condition<=5

//        for(initialization;condition;updating)
//        {
//            //body
//        }

//        for (int a = 1; a <= 20; a++)
//        {
//            System.out.println("Good evening");
//        }


        //table of 5
        //initialization=5;condition<=50;updating=var+5
        for (int x = 5; x <= 50; x = x + 5) {
            System.out.println(x);
        }
        System.out.println("=====================");
        //table of 5 in reverse order
        //initialization x=50       ;condition>=5   ;updatingx=x-5
        for (int y = 50; y >= 5; y = y - 5) {
            System.out.println(y);
        }


    }
}
