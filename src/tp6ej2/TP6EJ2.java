/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6ej2;

import Vista.Administracion;
import Vista.Ej_Frame;
import java.util.TreeSet;

/**
 *
 * @author crist
 */
public class TP6EJ2 {
    
    public static TreeSet<Producto> depositoProductos = new TreeSet<>();
    public static String[] rubros = {"Almacen","Electrodomesticos","Lavanderia","Carnes","Indumentaria"} ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        depositoProductos.add(new Producto(11,"Yerba",4500.75, 74, "Almacen"));
        depositoProductos.add(new Producto(13,"Azucar",950, 33, "Almacen"));
        depositoProductos.add(new Producto(16,"Suavizante",13500.50, 24, "Lavanderia"));
        depositoProductos.add(new Producto(18,"Microhondas",4500.75,3, "Electrodomesticos" ));

        
        new Administracion().setVisible(true);
    }
    
}
