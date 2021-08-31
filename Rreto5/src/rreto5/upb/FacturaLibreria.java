package rreto5.upb;


import java.util.Date;

/**
 *
 * @author user
 */
public class FacturaLibreria {
    private int id_factura;
    private Date fecha_compra;
    private Articulo[] articulo;
    private int valor_cancelado;

    public FacturaLibreria(int id_factura, Date fecha_compra, Articulo[] articulo, int valor_cancelado) {
        this.id_factura = id_factura;
        this.fecha_compra = fecha_compra;
        this.articulo = articulo;
        this.valor_cancelado = valor_cancelado;
    }

    public double totalLibreria(){
        int suma = 0;
        Articulo xl[] =getArticulo();
        for (Articulo xl1 : xl) {
            if (xl1.tipo_articulo.equals("Libro")) {
                suma = suma+40000;
                if (xl1.getColor_etiqueta().equals("Amarilla")) {
                    suma=suma+5000;
                } else if (xl1.getColor_etiqueta().equals("Roja")) {
                    suma=suma+10000;
                }
            } else if (xl1.tipo_articulo.equals("Revista")) {
                suma = suma+20000;
                if (xl1.getColor_etiqueta().equals("Amarilla")) {
                    suma=suma+5000;
                } else if (xl1.getColor_etiqueta().equals("Roja")) {
                    suma=suma+10000;
                } 
            }
        }
        
        return suma;
    }
    
    public String calcularDevuelta( ){
        int sumaa = (int) totalLibreria();
        int vueltas = valor_cancelado-sumaa;
        System.out.println(sumaa);
        System.out.println(vueltas);
        int valor = valor_cancelado%100;
        
        int valorindice=0, valora=0,valorb=0;
        boolean x=false;
        if(valor%2==0){
            for(int i=0;valorindice<=vueltas;i++){
                if((valorindice+2000)<=vueltas){
                    valorindice = valorindice + 2000;
                    valora+=1;
                }else {
                    valorindice = valorindice + 200;
                    valorb+=1;
                }
            }
            return "El cajero de taquilla debe devolver al comprador "+valora+" billetes de 2000 y "+valorb+" monedas de 200";
        }else if(valor%2!=0){
            for(int i=0;valorindice<=vueltas;i++){
                if((valorindice+1000)<=vueltas){
                    valorindice = valorindice + 1000;
                    valora+=1;
                }else {
                    valorindice = valorindice + 100;
                    valorb+=1;
                }
            }
            return "El cajero de taquilla debe devolver al comprador "+valora+" billetes de 1000 y "+valorb+" monedas de 100";
        }else if(valor%2!=0 && valor%5==0){
            for(int i=0;valorindice<=vueltas;i++){
                if((valorindice+5000)<=vueltas){
                    valorindice = valorindice + 5000;
                    valora+=1;
                }else{
                    valorindice = valorindice + 500;
                    valorb+=1;
                } 
            }
            return "El cajero de taquilla debe devolver al comprador "+valora+" billetes de 5000 y "+valorb+" monedas de 500";
        }else{
            return "error";
        }
    }
    
    int getId_factura() {
        return id_factura;
    }

    void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    Date getFecha_compra() {
        return fecha_compra;
    }

    void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    Articulo[] getArticulo() {
        return articulo;
    }

    void setArticulo(Articulo[] articulo) {
        this.articulo = articulo;
    }

    int getValor_cancelado() {
        return valor_cancelado;
    }

    void setValor_cancelado(int valor_cancelado) {
        this.valor_cancelado = valor_cancelado;
    }
    
    
}
