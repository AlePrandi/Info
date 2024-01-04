public class Test2 {
    public static void main(String[] args) {
        VettoriInteri v = new VettoriInteri(1);
        // add può sollevare una eccezione ma non la gestisce
        
        try {
            System.out.println("Il valore minimo e: " + v.cercaMin());
        } catch (ErroreVettoreVuoto e) {
            System.out.println(e.getMessage());
        }
        
        try {
            v.add(8);
            v.add(5);
            System.out.println("Il valore minimo e: " + v.cercaMin());
        } catch (ErroreVettoreVuoto | ErroreVettorePieno e) {
            System.out.println(e.getMessage());
        }

        try {
            v.add(8);
            v.add(5);
        } catch (ErroreVettorePieno e) {
            System.out.println(e.getMessage());
        }

    }
}
