package com.biblioteca.modelo;

/**
 * Representa un libro dentro del sistema de la biblioteca.
 * Esta clase contiene la información básica y el estado de un ejemplar.
 * * @author Daniel
 * @version 1.0
 * @since 2026-04-10
 */
public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private boolean prestado;

    /**
     * Constructor para crear un nuevo libro.
     * @param titulo El nombre de la obra.
     * @param autor El escritor del libro.
     */
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    /**
     * Cambia el estado del libro a prestado.
     * @return true si se pudo prestar, false si ya estaba prestado.
     */
    public boolean prestar() {
        if (!prestado) {
            prestado = true;
            return true;
        }
        return false;
    }

    /**
     * Método para obtener el título del libro.
     * @deprecated Este método será reemplazado por getDetalles Completos en la v2.0.
     * @return El título del libro.
     */
    @Deprecated
    public String getTitulo() {
        return titulo;
    }
}