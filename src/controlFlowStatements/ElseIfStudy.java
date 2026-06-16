package controlFlowStatements;

public class ElseIfStudy {
    public static void main(String[] args) {
        //if marks greater than or equal to 66 then-->dist
        //else if marks greater than or equal to 60 then -->1st class
        //else if marks greater than or equal 40 -->You are in pass class
        //else you are fail
        int marks = 1;
        if (marks >= 66) {
            System.out.println("you are in distinction");
        } else if (marks >= 60) {
            System.out.println("you are in 1st class");
        } else if (marks >= 40) {
            System.out.println("you are in pass class");
        } else {
            System.out.println("you are fail");
        }
        System.out.println("======================");
        //if signal is red then stop
        //else if signal is yellow then wait
        //else if signal is green the go
        //else provide valid signal colour
        String signal = "black";
        if (signal == "red") {
            System.out.println("stop");
        } else if (signal == "yellow") {
            System.out.println("wait");
        } else if (signal == "green") {
            System.out.println("go");
        } else {
            System.out.println("provide valid signal colour");
        }

    }
}
