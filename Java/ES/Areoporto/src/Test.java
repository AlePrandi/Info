public class Test {
    public static void main(String[] args) {
        Alianti a1 = new Alianti("ca4",200);
        Alianti a2 = new Alianti("ca2",40);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a1.eLoStesso(a2));
        System.out.println(a1.Comp(a2));
        Motore m1 = new Motore("cb2",300);
        Motore m2 = new Motore("bc3",150);
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m1.eLoStesso(m2));
        System.out.println(a1.Comp(m2));
    }
}
