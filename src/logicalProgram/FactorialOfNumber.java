package logicalProgram;

public class FactorialOfNumber {
    public static void main(String[] args) {
        //4= 4*3*2*1=24
        int number = 5;
        int fact = 1;
        for (int i = number; i >= 1; i--) {//4, 3, 2,1,0
            fact =  fact* i;
            //1*4=4
            //4*3=12
            //12*2=24
            //24*1=24

        }
        System.out.println(fact);
    }
}
