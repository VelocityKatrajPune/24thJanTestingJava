package thisAndSuperKeyword;

public class A {

    int x = 100;//global variable

    public void display() {
        int x = 1;// local variable
        int sum = x + 1;//used local value by default
        int sum1 = this.x + 1;//used global value by this
    }

}
