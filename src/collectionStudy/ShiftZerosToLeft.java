package collectionStudy;

public class ShiftZerosToLeft {
    public static void main(String[] args) {
        int ar[] = {1, 2, 0, 5, 0, 3, 0, 4, 9};//{1,2,5,3,4,9,0,0,0}
        int index = 0;
        for (int a : ar) {
            if (a == 0) {
                index++;
            }
        }
        int ar1[] = new int[ar.length];
        for (int a : ar) {
            if (a != 0) {
                ar1[index] = a;
                index++;
            }
        }
        for (int a : ar) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("==========shifted=========");
        for (int a1 : ar1) {
            System.out.print(a1 + " ");
        }

//i
//attended
//class
//in
//velocity

 //       i
 //attended
 //   class
 //      in
 // velocity


 //we live in pune we like Velocity
 // we live in  we like Velocity pune
    }
}
