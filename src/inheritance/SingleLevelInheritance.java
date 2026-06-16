package inheritance;

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Mother mother = new Mother();
        mother.nature();//calling super class method
        Mother.height();//calling super class method
        System.out.println("===================================");
        Son son = new Son();
        son.weight();//calling sub class method
        Son.hobbies();//calling sub class method
        System.out.println("===================================");
        son.weight();
        son.nature();//calling super class method using sub class object
        Son.hobbies();
        Son.height();//calling super class method using sub class reference

        System.out.println(son.bloodGroup);
        System.out.println(son.colour);


    }
}
