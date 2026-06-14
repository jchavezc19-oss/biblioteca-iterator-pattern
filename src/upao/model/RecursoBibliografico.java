package upao.model;
public class RecursoBibliografico {
    private String titulo;
    private String autor;
    private String codigoClasificacion;
    private boolean disponible;

    // Constructor para inicializar de forma rápida los recursos de la biblioteca
    public RecursoBibliografico(String titulo, String autor, String codigoClasificacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigoClasificacion = codigoClasificacion;
        this.disponible = disponible;
    }

    // Métodos Getters básicos para extraer la información sin exponer las variables privadas
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getCodigoClasificacion() { return codigoClasificacion; }
    public boolean isDisponible() { return disponible; }

    @Override
    public String toString() {
        return "[" + codigoClasificacion + "] " + titulo + " - " + autor + " | Disponible: " + (disponible ? "SÍ" : "NO");
    }
}