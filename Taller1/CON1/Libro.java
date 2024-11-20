public class Libro {
    
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Desconocido";
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}