public class Alianti extends Aereomobile implements Comparabile{
    private int aereodinamica;
    private final static int MIN_AEREODINAMICA=1;
    public Alianti(String sigla, int aereodinamica) {
        super(sigla);
        if(aereodinamica<=0){
            this.aereodinamica=MIN_AEREODINAMICA;
        }else{
            this.aereodinamica=aereodinamica;
        }
    }

    public int getAereodinamica() {
        return aereodinamica;
    }
    public String toString(){
        String s=super.toString();
        return s + " Aereodinamica: " + aereodinamica;
    }

    @Override
    public boolean Comp(Aereomobile a) {
        if(a==null || getClass() != a.getClass()){
            return false;
        }else{
            if(getAereodinamica()>((Alianti) a).getAereodinamica()){
                return true;
            }else{
                return false;
            }
        }
    }
}
