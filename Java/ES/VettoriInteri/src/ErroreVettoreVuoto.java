public class ErroreVettoreVuoto extends RuntimeException{
    
    public ErroreVettoreVuoto(){
        super("Vettore Vuoto");
    }

    public ErroreVettoreVuoto(String s){
        super(s);
    }
}
