package serializzazioneCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import originali.Autore;
import originali.Libreria;
import originali.Libro;

public class LibreriaCSV extends Libreria{
    private Vector<Libro> libri;

    public LibreriaCSV() {
        libri = new Vector<Libro>();
    }

    public void addVolume(Libro libro) {
        libri.add(libro);
    }

    public float getValore(){
        float valore = 0;
        for(Libro libro : libri){
            valore += libro.getPrezzo();
        }
        return valore;
    }

    //metodi necessari per la deserializzazione
    public Vector<Libro> getLibri() {
        return libri;
    }

    public void setLibri(Vector<Libro> libri) {
        this.libri = libri;
    }

    public void  salvaFile(String nomeFile) throws IOException{
        FileWriter fw = new FileWriter(nomeFile);
        fw.write("CostoPaginaFisso\n");
        fw.write("" + Libro.getCostoPagina());
        fw.write("Titolo, Nome, Cognome, NumeroPagine");
        for(Libro l : libri){
            fw.write("" + l.getTitolo());
            fw.write("" + l.getAutore());
            fw.write("" + l.getNumeroPagine());
            fw.write("\n");
        }
        fw.close();
    }

    public void caricaDaFile(String nomeFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(nomeFile));
        String s = "";
        String[] line = null;
        s = br.readLine();
        s = br.readLine();
        Libro.setCostoPagina(Double.parseDouble(s));
        s = br.readLine();
        s = br.readLine();
        while (s != null) {
            line = s.split(",");
            String titolo = line[0];
            String nomeAutore = line[1];
            String cognomeAutore = line[2];
            int numeroPagine = Integer.parseInt(line[3]);
            Autore autore = new Autore(nomeAutore, cognomeAutore);
            Libro libro = new Libro(titolo, autore, numeroPagine);
            libri.add(libro);
            s = br.readLine();
        }
        br.close();
    }

    @Override
    public String toString() {
        return "Libreria = " + libri ;
    }


    
}
