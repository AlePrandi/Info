import java.util.Vector;

public class VectorInteri {
    private Vector <Integer> vInteri;
    private final int DIM;

    public VectorInteri(int dimensione){
        DIM = (dimensione > 0) ? dimensione : 1;
        vInteri = new Vector<Integer>();
        for( int k = 0; k < DIM; k++){
            vInteri.set(k, 0);
        }
    }

    public void add(int n){
        vInteri.add(n);
    }

    public int getDimensione(){
        return vInteri.size();
    }

}
