import java.util.ArrayList;

class Biblioteca {
    ArrayList<Libro> catalogo = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        try {
        	
        } catch (Exception e) {
        	
        } finally {
        	
        }

        catalogo.add(libro);
    }

    public void listarCatalogo() {
        for (int i = 0; i < catalogo.size(); i++) {
            Libro libro = catalogo.get(i);
            System.out.println(libro.obtenerInformacion());
        }
    }

    public void agregarLibro1(Libro libro) {
        if (catalogo.contains(libro)) {
            catalogo.add(libro);
        }
    }
}