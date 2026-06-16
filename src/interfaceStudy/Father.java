package interfaceStudy;

public interface Father {

    void hardwork();
    void honesty();
    default void love()
    {
        System.out.println("Fathers love");
    }
    static void kindness()
    {
        System.out.println("Fathers kindness");
    }
}
