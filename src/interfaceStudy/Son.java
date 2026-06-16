package interfaceStudy;

public class Son implements Father, Mother {

    public static void main(String[] args) {
        Son son= new Son();
        son.hardwork();
        son.honesty();
        son.look();
        son.nature();
        son.love();
        Father.kindness();
        Mother.kindness();
    }

    @Override
    public void hardwork() {
        System.out.println("Fathers hardwork completed in Son class");
    }

    @Override
    public void honesty() {
        System.out.println("Fathers honesty completed in Son class");
    }

    @Override
    public void love() {
    Father.super.love();
    Mother.super.love();
    }

//    @Override
//    public void kindness() {
//
//    }

    @Override
    public void nature() {
        System.out.println("Mothers nature completed in Son class");
    }

    @Override
    public void look() {
        System.out.println("Mothers look completed in Son class");
    }
}
