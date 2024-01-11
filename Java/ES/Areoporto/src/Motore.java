public class Motore extends Aereomobile implements Comparabile{
    private int cv;
    private final static int MIN_CV=1;
    public Motore(String sigla,int cv) {
        super(sigla);
        if(cv<=0){
            this.cv=MIN_CV;
        }else{
            this.cv=cv;
        }
    }

    public int getCv() {
        return cv;
    }

    @Override
    public boolean Comp(Aereomobile a) {
        if(a==null || getClass() != a.getClass()){
            return false;
        }else{
            if(getCv()>((Motore) a).getCv()){
                return true;
            }else{
                return false;
            }
        }
    }

    public String toString(){
        String s=super.toString();
        return s + " Cavalli: " + cv;
    }
}
