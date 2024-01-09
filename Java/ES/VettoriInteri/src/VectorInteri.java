import java.util.Vector;

public class VectorInteri {
    private Vector<Integer> vInteri;

    public VectorInteri() {
        vInteri = new Vector<Integer>();
    }

    public VectorInteri(String elementi) {
        String[] elementiCorretti = elementi.split("\\|");
        int dimensione = elementiCorretti.length;
        vInteri = new Vector<Integer>();
        for (int k = 0; k < dimensione; k++) {
            try {
                vInteri.add(Integer.parseInt(elementiCorretti[k]));
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Elemento non valido: " + elementiCorretti[k]);
            }
        }
    }

    public VectorInteri(int dim) {
        if (dim > 0) {
            vInteri = new Vector<Integer>();
            for (int k = 0; k < dim; k++) {
                vInteri.add(0);
            }
        } else {
            vInteri = new Vector<Integer>();
            vInteri.add(0);
        }
    }

    public int getDim() {
        return vInteri.size();
    }

    public void add(int elemento) {
        vInteri.add(elemento);
    }

    public int getMin() {
        int min = vInteri.get(0);
        if (vInteri.size() > 0) {
            for (int k = 1; k < vInteri.size(); k++) {
                if (vInteri.get(k) < min)
                    min = vInteri.get(k);
            }
        } else {
            throw new ErroreVettoreVuoto();
        }
        return min;
    }

    public int cercaEl(int elemento) throws ErroreElementoInesistente {
        int tro = -1;
        int k = 0;
        while (k < vInteri.size() && tro == -1) {
            if (vInteri.get(k) == elemento)
                tro = k;
            else
                k++;
        }
        if (tro != -1)
            return tro;
        else
            throw new ErroreElementoInesistente();
    }

    public void eliminaPrimo(int elemento) throws ErroreElementoInesistente {
        int pos = cercaEl(elemento);
        vInteri.remove(pos);
    }

    public String toString() {
        String str = "";
        for (int k : vInteri) {
            str += k + " ";
        }
        return str;
    }
}
