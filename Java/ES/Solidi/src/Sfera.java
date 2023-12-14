public class Sfera extends Solido{
    private double raggio;

    public Sfera(double raggio, double peso_spec) {
        super(peso_spec);
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public double getSuperficie() {
        return 4 * Math.PI * Math.pow(raggio,2);
    }

    public double getVolume(){
        return (4 * Math.PI * Math.pow(raggio, 3)) / 3;
    }

    public String toString(){
        return "Raggio: " + raggio + "      Superficie: " + getSuperficie() + "     Volume: " + getVolume();
    }
}
