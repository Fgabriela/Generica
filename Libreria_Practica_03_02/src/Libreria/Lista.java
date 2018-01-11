package Libreria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JonnathanMatute
 */
public class Lista<E> {

    private ArrayList<E> elementoList = new ArrayList<E>();

    public Lista() {
    }

    public ArrayList<E> getElementoList() {
        return elementoList;
    }

    public void setElementoList(ArrayList<E> elementoList) {
        this.elementoList = elementoList;
    }

    public boolean agregarElemento(E valor) {
        return this.elementoList.add(valor);
    }

    public E recuperarElemento(E obj) {
        for (E s : this.elementoList) {
            if (s.equals(obj)) {
                return s;
            }
        }
        return null;
    }

    public boolean eliminarElemento(E obj) {
        E ob = this.recuperarElemento(obj);
        return this.elementoList.remove(ob);
    }

    public List<E> recuperarElementos() {
        List<E> retorno = new ArrayList<E>();
        for (E s : this.elementoList) {
            retorno.add(s);
        }
        return retorno;
    }
}
