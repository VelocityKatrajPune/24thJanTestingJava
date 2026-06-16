package ArrayStudy;

public class ArraySample4 {
    public static void main(String[] args) {

        String subject[][] = {{"ab", "bc", "cd","xx"}, {"de", "ef", "fg","yy"},{"aa","bb","cc","dd"}};

        //outer for loop-->row
        for (int i = 0; i <= subject.length - 1; i++) {
            //inner for loop-->columns
            for (int j = 0; j <= subject[i].length - 1; j++) {
                System.out.print(subject[i][j] + " ");
            }
            System.out.println();
        }

    }
}
