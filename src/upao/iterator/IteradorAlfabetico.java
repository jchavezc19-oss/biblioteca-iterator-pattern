package upao.iterator;

import upao.model.RecursoBibliografico;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Código base desarrollado por: Chávez Leonardo
 * Propósito: Recorrido secuencial ordenado alfabéticamente por título.
 */
public class IteradorAlfabetico implements IteradorInterface {
    private List<RecursoBibliografico> listaOrdenada;
    private int indice = 0; // Puntero de posición actual

    public IteradorAlfabetico(List<RecursoBibliografico> recursosOriginales) {
        // Clonación defensiva para aislar los datos internos y no alterar la base de
        // datos original
        if (recursosOriginales == null) {
            this.listaOrdenada = new ArrayList<>();
            return;
        }
        this.listaOrdenada = new ArrayList<>(recursosOriginales);

        // Algoritmo de ordenamiento secuencial por título de la A a la Z
        this.listaOrdenada.sort(Comparator.comparing(r -> r.getTitulo().toLowerCase()));
    }

    @Override
    public boolean hasNext() {
        // Retorna verdadero si el puntero no ha superado el tamaño máximo de la lista
        // ordenada
        return indice < listaOrdenada.size();
    }

    @Override
    public RecursoBibliografico next() {
        if (!hasNext()) {
            return null;
        }
        // Extrae el recurso en la posición del puntero y lo incrementa de inmediato (++
        // en postfijo)
        return listaOrdenada.get(indice++);
    }
}