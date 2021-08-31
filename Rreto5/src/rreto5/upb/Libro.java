package rreto5.upb;

/**
 *
 * @author user
 */
public class Libro extends Articulo{
    private String genero;
    private String autor;

    public Libro(int id_articulo,String nombre, String color_etiqueta,String tipo_articulo,String genero, String autor) {
        super(id_articulo, nombre, color_etiqueta);
        this.tipo_articulo = tipo_articulo;
        this.genero = genero;
        this.autor = autor;
    }

    public Libro(String genero, String autor) {
        this.genero = genero;
        this.autor = autor;
    }

    public Libro() {
    }

    String getGenero() {
        return genero;
    }

    void setGenero(String genero) {
        this.genero = genero;
    }

    String getAutor() {
        return autor;
    }

    void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
}
