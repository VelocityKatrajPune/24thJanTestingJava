package controlFlowStatements;

public class IfElseStudy {
    //if marks greater than or equal 40 -->You are pass
    //else--> You are fail

    //if(condition)  true-->if Body/ false-->elseBody
//    {
//        //body
//    }
//    else
//    {
//        //body
//    }
    public static void main(String[] args) {
        int marks = 99;
        if (marks >= 40) {
            System.out.println("You are pass");
        } else {
            System.out.println("You are fail");
        }
        System.out.println("======================");
        //if gender is M then you are male
        //else you are female
        char gender = 'M';
        if (gender == 'M') {
            System.out.println("You are male");
        } else {
            System.out.println("You are female");
        }
        System.out.println("======================");
        //if signal is red then stop
        //else go
        String signal = "yellow";
        if (signal == "red") {
            System.out.println("stop");
        } else {
            System.out.println("go");
        }

    }


}
