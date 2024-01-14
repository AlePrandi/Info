public class Barca {
    private String nome;
    private String nazionalita;
    private String proprietario;
    private double lunghezza;
    private double larghezza;
    private int numeroPosto;
    private boolean occupato;
    private int giorniOccupati;

    public Barca(String nome, String nazionalita, String proprietario, double lunghezza, double larghezza,int numeroPosto, int giorni) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.proprietario = proprietario;
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.numeroPosto = numeroPosto;
        this.occupato = false;
        this.giorniOccupati = (giorni > 0) ? giorni : 1;
    }

    public String getNome() {
        return nome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public int getNumeroPosto() {
        return numeroPosto;
    }

    public void setNumeroPosto(int numeroPosto) {
        this.numeroPosto = numeroPosto;
    }

    public boolean isOccupato() {
        return occupato;
    }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }

    public int getGiorniOccupati() {
        return giorniOccupati;
    }

    public void setGiorniOccupati(int giorniOccupati) {
        this.giorniOccupati = giorniOccupati;
    }



    @Override
    public String toString() {
        return "Barca [nome=" + nome + ", nazionalita=" + nazionalita + ", proprietario=" + proprietario
                + ", lunghezza=" + lunghezza + ", larghezza=" + larghezza + ", numeroPosto=" + numeroPosto
                + ", occupato=" + occupato + ", giorniOccupati=" + giorniOccupati + "]";
    }
}
