public abstract class Solido {
    private double pesoSpecifico;

    public Solido(double peso_spec){
        pesoSpecifico = peso_spec;
    }

    public double getPesoSpecifico() {
        return pesoSpecifico;
    }

    public abstract double getSuperficie();

    public abstract double getVolume();

}
