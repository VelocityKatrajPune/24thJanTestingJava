package logicalProgram;

public class ReverseString {
    public static void main(String[] args) {


        String s = "Pune";  //enuP
        String rev = "";
        //inti =maxIndex-->s.length()-1   update --> -1   condition  >=0
        for (int i = s.length() - 1; i >= 0; i--)//i=3,2,1,0,-1
        {
            char t = s.charAt(i);//e,n,u,P
            rev = rev + t;//     e =""+e
            //en=e+n
            //enu=en+u
            //enuP=enu+P
        }
        System.out.println(rev);
    }

}
