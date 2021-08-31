/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rreto5;

import java.time.LocalDate;
import java.time.ZoneId;
import rreto5.upb.FacturaLibreria;
import rreto5.upb.Libro;

/**
 *
 * @author user
 */
public class Rreto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro arrayArticulos[] = new Libro[3];
        LocalDate hoy = LocalDate.now();
        
        
        //date = java.util.Date.from(hoy.atStartOfDay(defaultZoneId).toInstant());
        ZoneId defaultZoneId = ZoneId.systemDefault();
        java.util.Date date = java.util.Date.from(hoy.atStartOfDay(defaultZoneId).toInstant());
        for(int i=0;i<arrayArticulos.length;i++){
            arrayArticulos[i] = new Libro(i, "ete","Roja","Libro","Comedia","Arenitas");
        }
        for(Libro arti: arrayArticulos){
            System.out.println(arti.getNombre());
            System.out.println(arti.getTipo_articulo());
            System.out.println("");
        }
        FacturaLibreria fl = new FacturaLibreria(0,date,arrayArticulos,200050);
        String i=fl.calcularDevuelta();
        System.out.println("Total: "+i);
    }
    
}
