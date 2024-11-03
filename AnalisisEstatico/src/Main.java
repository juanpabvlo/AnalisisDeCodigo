public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("El Gran Gatsby", "F. Scott Fitzgerald");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro libro3 = new Libro("Matar un Ruiseñor", "Harper Lee");

        biblioteca.agregarLibro(libro1);

        for (Libro libro : biblioteca.catalogo) {
            String x;
        }

        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println("Catálogo de la Biblioteca:");
        biblioteca.listarCatalogo();
    }
}