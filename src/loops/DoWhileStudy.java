package loops;

public class DoWhileStudy {
    public static void main(String[] args) {
        //I want to print Velocity 3 times
        //initialization=100      condition<=102   updation ++

        int i = 100;//initialization
        do {
            System.out.println("Velocity");//body
            i++;//updation
        } while (i <= 102);
        System.out.println("============");
        //I want table of 6
        //initialization=6      condition<=60   updation +6
        int m = 6;
        do {
            System.out.println(m);//6,12....54,60
            m = m + 6;//12,18,60,66
        } while (m <= 60);
        System.out.println("============");
        //I want table of 6 in reverse order
        //initialization=60      condition>=6   updation -6

        int n = 60;
        do {
            System.out.println(n);
            n = n - 6;
        } while (n >= 6);
    }
}
