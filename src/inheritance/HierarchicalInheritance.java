package inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Mother mother = new Mother();
        Son1 son1 = new Son1();
        Son2 son2 = new Son2();

        mother.nature();//non static from mother class
        son1.nature();//non static from mother(super) class
        son1.mobile();//non static from son1(own) class
        son2.bike();//non static from son2(own) class
        son2.nature(); //non static from mother(super) class

        Son2.car();
        Son2.height();

        Son1.laptop();
        Son1.height();


    }
}
