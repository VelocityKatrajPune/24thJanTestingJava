package collectionStudy;

public class ShiftZerosToRight {
    public static void main(String[] args) {
        int ar[] = {1, 2, 0, 5, 0, 3, 0, 4, 9};//{1,2,5,3,4,9,0,0,0}
        int ar1[] = new int[ar.length];//0,0,0,0,0,0,0,0
        int index = 0;//1,2
        for (int a : ar) {//1,2
            if (a != 0) {
                ar1[index] = a;
                index++;
            }
        }

        for (int a : ar) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("====shifted======");
        for (int a1 : ar1) {
            System.out.print(a1 + " ");
        }
    }
}
