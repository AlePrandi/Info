import java.util.Vector;

public class Molo {
    private int numero;
    private double prezzo_giorn;
    private double lung_max;
    private double larg_max;
    private Vector<Barca> barche;

    public Molo(int numero, double prezzo_giorn, double lung_max, double larg_max) {
        this.numero = numero;
        this.prezzo_giorn = prezzo_giorn;
        this.lung_max = lung_max;
        this.larg_max = larg_max;
        this.barche = new Vector<Barca>();
    }

    public void addBarca(Barca b) {
        if (b != null && b.getLarghezza() < larg_max && b.getLunghezza() < lung_max) {
            barche.add(b);
        }
    }
    
    public Vector<Barca> getBarche() {
        return barche;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrezzo() {
        return prezzo_giorn;
    }

    public void setPrezzo(double prezzo_giorn) {
        this.prezzo_giorn = prezzo_giorn;
    }

    public double getLung_max() {
        return lung_max;
    }

    public void setLung_max(double lung_max) {
        this.lung_max = lung_max;
    }

    public double getLarg_max() {
        return larg_max;
    }

    public void setLarg_max(double larg_max) {
        this.larg_max = larg_max;
    }

    public void visualizzaPosti(Barca barca) {
        for (Barca b : barche) {
            if (!b.isOccupato() && barca.getLunghezza() < this.lung_max && barca.getLarghezza() <= this.larg_max) {
                double importo = b.getGiorniOccupati() * this.prezzo_giorn;
                System.out.println("Molo: " + this.numero + ", Posto: " + b.getNumeroPosto() + ", Importo Totale: " + importo);
            }
        }
    }

    @Override
    public String toString() {
        return "Molo [numero=" + numero + ", prezzo_giorn=" + prezzo_giorn + ", lung_max=" + lung_max + ", larg_max="
                + larg_max + ", barche=" + barche + "]";
    }

}
