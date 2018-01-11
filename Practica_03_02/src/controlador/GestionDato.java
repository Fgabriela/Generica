package controlador;

import java.util.List;
import modelo.Casa;

/**
 *
 * @author JonnathanMatute
 */
public class GestionDato {

    //Metodos de Busqueda
    public List<Casa> metodoBurbuja(List<Casa> casaList) {
        Casa[] arreglo = new Casa[casaList.size()];
        int k = 0;
        for (Casa c : casaList) {
            arreglo[k] = c;
            k++;
        }
        for (int i = 0; i < casaList.size(); i++) {
            for (int j = 0; j < casaList.size(); j++) {
                if (arreglo[i].getId() < arreglo[j].getId()) {
                    Casa aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        casaList.clear();
        for (Casa c : arreglo) {
            casaList.add(c);
        }
        return casaList;
    }
}
