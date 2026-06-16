package interfaceStudy;

public interface Mother {
    void nature();
    void look();
    default void love()
    {
        System.out.println("Mothers love");
    }
    static void kindness()
    {
        System.out.println("Fathers kindness");
    }
}
