package loops;

public class Decrement {
    public static void main(String[] args) {
        int p=100;
        System.out.println("p:"+p);
        System.out.println("================");
        int l=p--;//post decrement
        System.out.println("p:"+p);
        System.out.println("l:"+l);
        System.out.println("================");
        int q=6;
        System.out.println("q:"+q);
        System.out.println("================");
        int m=--q;//pre decrement
        System.out.println("q:"+q);
        System.out.println("m:"+m);
        System.out.println("================");
        int z=-99;
        int a=z--;
        System.out.println("z:"+z);
        System.out.println("a:"+a);
    }
}
