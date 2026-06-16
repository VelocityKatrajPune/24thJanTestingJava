package interfaceStudy;

public class EncapsulationStudy {

private int balanace=100;

    public void deposite(int money)
    {
         balanace=balanace+money;
    }

    public void withDraw(int money)
    {
        balanace=balanace-money;
    }

    public void balanceInq()
    {
        System.out.println(balanace);
    }
}
