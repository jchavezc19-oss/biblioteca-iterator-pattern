package upao.iterator;

import upao.model.RecursoBibliografico;

// Interfaz que desacopla al cliente de la estructura de datos real (Base de Refactoring Guru)
public interface IteradorInterface {
    // Verifica si todavía quedan elementos por revisar en la lista
    boolean hasNext();
    // Devuelve el elemento actual y avanza el puntero al siguiente
    RecursoBibliografico next();
}