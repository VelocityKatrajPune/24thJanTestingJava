package methodStudy;

public class StudentInfo {
    public static void main(String[] args) {
        studentData();
        studentData();
        studentData("Tilak",1,'B',88.88f,true);
        studentData("Ishan",12,'C',90f,true);
    }

    //StudentInfo-->name(String), rollNum(int), div(char), marks(float), result(boolean)
    public static void studentData() {
        String name = "Surya";
        int rollNum = 63;
        char div = 'A';
        float marks = 99.99f;
        boolean result = true; // (true-->pass false-->fail)
        System.out.println("========================================");
        System.out.println("Student name is " + name);
        System.out.println("Student rollNum is " + rollNum);
        System.out.println("Student division is " + div);
        System.out.println("Student marks are " + marks);
        System.out.println("Student result is " + result);
        System.out.println("========================================");

    }
    //StudentInfo-->name(String), rollNum(int), div(char), marks(float), result(boolean)
    public static void studentData(String name,int rollNum, char div, float marks, boolean result)
    {
        System.out.println("=========================================");
        System.out.println("Student name is " + name);
        System.out.println("Student rollNum is " + rollNum);
        System.out.println("Student division is " + div);
        System.out.println("Student marks are " + marks);
        System.out.println("Student result is " + result);
        System.out.println("========================================");


    }

}