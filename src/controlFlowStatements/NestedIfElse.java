package controlFlowStatements;

public class NestedIfElse {
    public static void main(String[] args) {
        //if username is correct--> please enter password
               //if password is correct-->login success-->inbox
             //else password is incorrect-->please check your password
        //else username is incorrect---> please check username

        String username = "test";
        String password = "test1@123";
        if (username == "test") {
            System.out.println("username is correct, please enter password");
            if (password == "test@123") {
                System.out.println("password is correct, login success");
            } else {
                System.out.println("password is incorrect, login failed");
            }
        } else {
            System.out.println("username is incorrect");
        }


    }
}
