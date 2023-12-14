public class Test {
    public static void main(String[] args) {
        Videoteca v1 = new Videoteca("Pino", "Via Roma 10", 10);
        Dvd d1 = new Dvd("Fast and furious", 100);
        Dvd d2 = new Dvd("Harry Potter", 120);
        Cd c1 = new Cd("XDVR", 1200, 15, 3);
        Cd c2 = new Cd("X2VR",1300,12,4);
        d1.add(Lingue.ITA);
        d2.add(Lingue.F);
        v1.Add(d1);
        v1.Add(d2);
        v1.Add(c1);
        v1.Add(c2);
        v1.Vendo(3);
        v1.Compro(1);
        v1.Compro(2);
        v1.Vendo(4);
        System.out.println(v1.toString());
    }
}
