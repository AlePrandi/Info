public class VettoriInteri {
    private final int DIM;

    private int[] vInteri;

    private int nInteri;

    public VettoriInteri(int dimensione){
        DIM = (dimensione > 0) ? dimensione : 1;
        vInteri = new int[dimensione];
        nInteri = 0;
    }
    
    public int getDimensione(){
        return DIM;
    }

    public void add(int n) throws ErroreVettorePieno{
        if(nInteri < DIM){
            vInteri[nInteri] = n;
            nInteri++;
        }else
            throw new ErroreVettorePieno();
    }

    public int cercaMin() throws ErroreVettoreVuoto{
        if(nInteri > 0){
        int k = 0, tro = -1;
        int min = 0;
        while (k < nInteri && tro == -1){
            if (k == 0)
                min = vInteri[k];
            else{
                if (vInteri[k] < min)
                    min = vInteri[k];
            }
            k++;
        }
        return min;            
        }else{
            throw new ErroreVettoreVuoto();            
        }
    }
}
