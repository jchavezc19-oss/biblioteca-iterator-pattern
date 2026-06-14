package upao.collection;

import upao.iterator.IteradorAlfabetico;
import upao.iterator.IteradorDisponibilidad;
import upao.model.RecursoBibliografico;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaDigital implements ColeccionAgregado {
    // Estructura interna oculta para el cliente externo
    private List<RecursoBibliografico> recursos;

    public BibliotecaDigital() {
        this.recursos = new ArrayList<>();
    }

    public void agregarRecurso(RecursoBibliografico recurso) {
        this.recursos.add(recurso);
    }

    // Fábrica: Retorna el iterador desarrollado por Jorge Chávez
    @Override
    public upao.iterator.IteradorInterface crearIteradorAlfabetico() {
        return new IteradorAlfabetico(this.recursos);
    }

    // Fábrica: Retorna el iterador desarrollado 
    @Override
    public upao.iterator.IteradorInterface crearIteradorDisponibilidad() {
        return new IteradorDisponibilidad(this.recursos);
    }
/**
     * Método de inicialización masiva añadido para auditoría y pruebas rápidas.
     * Desarrollado por: Chávez Leonardo
     */
    public void cargarCatalogoPredeterminado() {
        this.agregarRecurso(new upao.model.RecursoBibliografico("Patrones de Diseño", "GoF", "Código-A", true));
        this.agregarRecurso(new upao.model.RecursoBibliografico("Álgebra Lineal", "Grossman", "Código-B", false));
        this.agregarRecurso(new upao.model.RecursoBibliografico("Cien Años de Soledad", "García Márquez", "Código-C", true));
        this.agregarRecurso(new upao.model.RecursoBibliografico("Ingeniería de Software", "Pressman", "Código-D", false));
    }
}