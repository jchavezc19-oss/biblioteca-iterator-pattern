package upao.collection;
import upao.iterator.IteradorInterface;

// Define que cualquier colección de la app debe ser capaz de generar iteradores
public interface ColeccionAgregado {
    IteradorInterface crearIteradorAlfabetico();
    IteradorInterface crearIteradorDisponibilidad();
}