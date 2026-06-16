package controlFlowStatements;

public class SwitchCaseStudy {
    public static void main(String[] args) {
        //1-->jan
        // 12-->dec
//        int month = 12;
//        switch (month) {
//            case 1:
//                System.out.println("Jan");
//                break;
//            case 2:
//                System.out.println("Feb");
//                break;
//            case 3:
//                System.out.println("Mar");
//               // break;
//            case 4:
//                System.out.println("Apr");
//               // break;
//            default: System.out.println("Please enter month value between 1-12");
//                break;
//        }

        //season-->summer, winter, rainy
        //summer-->turn on AC
        //winter-->turn on heater
        //rainy-->turn on umbrella

//        String season="summer";
//        switch (season)
//        {
//            case "summer":System.out.println("turn on AC");
//            break;
//            case "winter":System.out.println("turn on heater");
//            break;
//            case "rainy":System.out.println("turn on umbrella");
//            break;
//            default:System.out.println("please enter valid season name");
//            break;
//        }

        //A-->English Medium
        //B-->Semi English
        //C-->Marathi

        char div='A';
        switch (div)
        {
            case 'A':System.out.println("English Medium");
            break;
            case 'B':System.out.println("Semi English");
            break;
            case 'C':System.out.println("Marathi");
            break;
            default:System.out.println("enter div in A_C");
            break;
        }
    }
}
