package com.biblioteca.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de gestionar la lógica de préstamos y búsqueda de libros.
 * * @author Daniel
 * @version 1.0
 * @since 2026-04-10
 */
public class GestorBiblioteca {
    // Atributos (Mínimo 2) [cite: 7]
    private List<Libro> catalogo;
    private String nombreSucursal;

    /**
     * Inicializa el gestor con el nombre de la sucursal.
     * @param nombreSucursal Nombre identificativo de la biblioteca.
     */
    public GestorBiblioteca(String nombreSucursal) {
        this.catalogo = new ArrayList<>();
        this.nombreSucursal = nombreSucursal;
    }

    /**
     * Añade un libro al catálogo de la biblioteca.
     * @param libro Objeto de tipo Libro a añadir.
     * @throws IllegalArgumentException Si el objeto libro es nulo.
     */
    public void agregarLibro(Libro libro) throws IllegalArgumentException {
        if (libro == null) {
            throw new IllegalArgumentException("El libro no puede ser nulo");
        }
        catalogo.add(libro);
    }

    /**
     * Busca si un libro está disponible por su título.
     * @param titulo El título a buscar.
     * @return El objeto Libro si se encuentra, null en caso contrario.
     */
    public Libro buscarLibro(String titulo) {
        for (Libro l : catalogo) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }
}
