package rreto5.upb;



/**
 *
 * @author user
 */
public class Articulo {
    private int id_articulo;
    private String nombre;
    private String color_etiqueta;
    String tipo_articulo;

    public Articulo(int id_articulo, String nombre, String color_etiqueta) {
        this.id_articulo = id_articulo;
        this.nombre = nombre;
        this.color_etiqueta = color_etiqueta;
    }

    public Articulo() {
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor_etiqueta() {
        return color_etiqueta;
    }

    public void setColor_etiqueta(String color_etiqueta) {
        this.color_etiqueta = color_etiqueta;
    }

    public String getTipo_articulo() {
        return tipo_articulo;
    }

    public void setTipo_articulo(String tipo_articulo) {
        this.tipo_articulo = tipo_articulo;
    }
    
    
}
