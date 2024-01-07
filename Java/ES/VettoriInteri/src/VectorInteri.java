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

    public int cercaMin() throws ErroreVettoreVuoto{
        if(!vInteri.isEmpty()) {
            int min = vInteri.get(0);
    
            for(int i = 1; i < vInteri.size(); i++) {
                if(vInteri.get(i) < min) {
                    min = vInteri.get(i);
                }
            }
    
            return min;
            
        }else{
            throw new ErroreVettoreVuoto();
        }
    }

}
