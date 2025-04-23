package Model;

abstract public class Libro {

    private String titulo, autor;
    private int numeroPaginas, isbn;
    private String categoria;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroPaginas, int isbn, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;
        this.categoria = categoria;
    }

    public void mostrarDatos() {
        System.out.println("Título del Libro: " + titulo);
        System.out.println("Nombre del Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Identificador: " + isbn);
        System.out.println("Categoría: " + categoria);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;  // Corrige la asignación
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
