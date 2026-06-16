package controlFlowStatements;

public class ElseIfEg2 {
    public static void main(String[] args) {
        //marks--10
        //A-->   8>= and=<9
        //B-->   7>= and =<8
        //C-->   5>= and <=7
        //D

        int marks=12;
       if(marks>=8 && marks<=9)
       {
           System.out.println("you got A grade");
       } else if (marks>=7 && marks<=8) {
           System.out.println("you got B grade");
       } else if (marks>=5 && marks<=7) {
           System.out.println("you got C grade");
       }
       else {
           System.out.println("you got D grade");
       }


    }
}
