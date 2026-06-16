package logicalProgram;

public class FindDuplicateElementsInIntArray {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 1, 3, 5, 4, 4, 1, 4, 6};   //1,3,4
        int count = 0;

        for (int i = 0; i <= ar.length - 1; i++) {
            for (int j = i + 1; j <= ar.length - 1; j++) {
                if (ar[i] == ar[j]) {
                    System.out.println("duplicate found " + ar[i]);
                    count++;
                }

            }

        }
        System.out.println("total duplicate numbers are " + count);

    }
}
