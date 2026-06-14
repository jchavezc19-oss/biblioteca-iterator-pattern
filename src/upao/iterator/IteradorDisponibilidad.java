package upao.iterator;

import java.util.List;

import upao.model.RecursoBibliografico;

/**
 * Código base desarrollado por: Jorge Chavez
 * Propósito: Recorrer únicamente los elementos que están aptos para préstamo inmediato.
 */
public class IteradorDisponibilidad implements IteradorInterface {
    private List<RecursoBibliografico> recursos;
    private int indice = 0;

    public IteradorDisponibilidad(List<RecursoBibliografico> recursos) {
        this.recursos = recursos;
    }

    @Override
    public boolean hasNext() {
        // Bucle de salto dinámico: avanza el puntero si encuentra un libro ocupado (disponible == false)
        while (indice < recursos.size() && !recursos.get(indice).isDisponible()) {
            indice++;
        }
        return indice < recursos.size();
    }

    @Override
    public RecursoBibliografico next() {
        if (!hasNext()) {
            return null;
        }
        // Devuelve el libro disponible hallado y mueve el puntero una posición más adelante
        return recursos.get(indice++);
    }
}