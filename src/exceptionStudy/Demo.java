package exceptionStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        System.out.println("hi");
        Thread.sleep(1000);

        FileInputStream myfile= new FileInputStream("");

    }
}
