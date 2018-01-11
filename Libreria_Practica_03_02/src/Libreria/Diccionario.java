package Libreria;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author JonnathanMatute
 */
public class Diccionario<K, E> {

    private Hashtable<K, E> elemento = new Hashtable<K, E>();

    public Diccionario() {
    }

    public Hashtable<K, E> getElemento() {
        return elemento;
    }

    public void setElemento(Hashtable<K, E> elemento) {
        this.elemento = elemento;
    }

    public boolean agregarElemento(K clave, E valor) {
        this.elemento.put(clave, valor);
        return true;
    }

    public E recuperarElemento(K clave) {
        return this.elemento.get(clave);
    }

    public List<E> recuperarElementos() {
        List<E> retorno = new ArrayList<E>();
        Enumeration<E> enumeracion = this.elemento.elements();
        while (enumeracion.hasMoreElements()) {
            retorno.add(enumeracion.nextElement());
        }
        return retorno;
    }

    public boolean eliminarElemento(K clave) {
        this.elemento.remove(clave);
        return true;

    }
}
