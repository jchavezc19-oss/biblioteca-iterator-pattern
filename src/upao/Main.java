package upao;

import upao.collection.BibliotecaDigital;
import upao.iterator.IteradorInterface;
import upao.model.RecursoBibliografico;

public class Main {
    public static void main(String[] args) {
        BibliotecaDigital biblioteca = new BibliotecaDigital();

        // Llenado de datos de prueba en desorden
        biblioteca.agregarRecurso(new RecursoBibliografico("Patrones de Diseño", "GoF", "Código-A", true));
        biblioteca.agregarRecurso(new RecursoBibliografico("Álgebra Lineal", "Grossman", "Código-B", false));
        biblioteca.agregarRecurso(new RecursoBibliografico("Cien Años de Soledad", "García Márquez", "Código-C", true));
        biblioteca.agregarRecurso(new RecursoBibliografico("Ingeniería de Software", "Pressman", "Código-D", false));

        System.out.println("--- RECORRIDO DE JORGE CHÁVEZ (Alfabético por Título) ---");
        IteradorInterface iteradorJorge = biblioteca.crearIteradorAlfabetico();
        while (iteradorJorge.hasNext()) {
            System.out.println(iteradorJorge.next());
        }

        System.out.println("\n--- RECORRIDO (Solo Libros Disponibles) ---");
        IteradorInterface iterador = biblioteca.crearIteradorDisponibilidad();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}