package logicalProgram;

public class ReverseOddPlacesFromString {
    public static void main(String[] args) {
        String s = "Java Selenium Automation Testing";
        String[] s1 = s.split(" "); //{"Java" "Selenium" "Automation"}
        String rev = "";
        for (int i = 0; i <= s1.length - 1; i++) {
            if (i % 2 != 0) {
                String temp = s1[i];//selenium
                for (int j = temp.length() - 1; j >= 0; j--) {
                    rev = rev + temp.charAt(j);// rev=muineleS
                }
                s1[i] = rev;//selenium
                rev = "";
            }
        }


        for (int i = 0; i <= s1.length - 1; i++) {
            System.out.print(s1[i] + " ");
        }

    }
}
