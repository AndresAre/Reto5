package rreto5.upb;


/**
 *
 * @author user
 */
public class Revista extends Articulo{
    private String tipo_revista;

    public Revista(int id_articulo, String nombre, String color_etiqueta, String tipo_articulo, String tipo_revista){
        super(id_articulo, nombre, color_etiqueta);
        this.tipo_articulo = tipo_articulo;
        this.tipo_revista = tipo_revista;
    }
    
    public Revista(){
        
    }
 
    public Revista(String tipo_revista){
        this.tipo_revista=tipo_revista;
    }

    String getTipo_revista() {
        return tipo_revista;
    }

    void setTipo_revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
    }
    
    
    
}
