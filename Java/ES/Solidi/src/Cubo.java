import java.lang.Math;
public class Cubo extends Solido{
    private double lato;

    public Cubo(double lato, double peso_spec) {
        super(peso_spec);
        this.lato = (lato > 0) ? lato : 1;
    }

    public double getLato() {
        return lato;
    }

    public double getSuperficie() {
        return 6 * Math.pow(lato,2);
    }

    public double getVolume(){
        return Math.pow(lato, 3);
    }

    public String toString(){
        return "Lato: " + lato + "      Superficie: " + getSuperficie() + "     Volume: " + getVolume();
    }
}
