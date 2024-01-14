public class Test {
    public static void main(String[] args) {
        Porto porto = new Porto("Porto di Genova", "Genova");

        Molo molo1 = new Molo(1, 10.0, 50.0, 15.0);

        porto.addMolo(molo1);

        Barca barca1 = new Barca("Barca1", "Italia", "Proprietario1", 25.0, 4.0, 0,5);
        Barca barca2 = new Barca("Barca2", "Francia", "Proprietario2", 38.0, 8.0, 1,3);
        molo1.addBarca(barca1);
        molo1.addBarca(barca2);

        molo1.visualizzaPosti(barca1);
        molo1.visualizzaPosti(barca2);
    }
}
