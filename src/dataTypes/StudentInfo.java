package dataTypes;
public class StudentInfo {
    public static void main(String[] args) {
        //name, rollNum, div, marks, attendance(true-->present/ false-->absent)
        //variable declaration
        String name;
        int rollNum;
        char div;
        float marks;
        boolean attendance;
        // variable initialization /assign
        name = "Mahesh Babu";
        rollNum = 10;
        div = 'A';
        marks = 90.99f;
        attendance = true;
        System.out.println("My name is " + name);
        System.out.println("My roll Number is " + rollNum);
        System.out.println("My div is " + div);
        System.out.println("My marks are " + marks);
        System.out.println("My attendance is " + attendance);
    }
}
