import java.util.Vector;

public class Porto {
    private String nome;
    private String localita;
    private Vector<Molo> moli;
    
    public Porto(String nome, String localita) {
        this.nome = nome;
        this.localita = localita;
        this.moli = new Vector<>();
    }
    
    public void addMolo(Molo molo) {
        moli.add(molo);
    }
    
    public String getNome() {
        return nome;
    }

    public String getLocalita() {
        return localita;
    }

    @Override
    public String toString() {
        return "Porto [nome=" + nome + ", localita=" + localita + ", moli=" + moli + "]";
    }   
}
