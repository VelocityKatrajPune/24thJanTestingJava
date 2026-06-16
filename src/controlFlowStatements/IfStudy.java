package controlFlowStatements;

public class IfStudy {
    public static void main(String[] args) {
        //if marks greater than or equal 40 -->You are pass
//        if(condition)// true-->body, false-->noBody
//        {
//            //body
//        }
        int marks=40;
        if(marks>=40)
        {
            System.out.println("You are pass");
        }
        System.out.println("======================");
        //if gender is M then you are male
        char gender='M';
        if(gender=='M')
        {
            System.out.println("You are male");
        }
        System.out.println("======================");
        //if signal is red then stop
        String signal="red";
        if(signal=="red")
        {
            System.out.println("stop");
        }

    }
}
