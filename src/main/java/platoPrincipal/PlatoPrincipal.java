/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platoPrincipal;

/**
 *
 * @author CAMILO
 */
public class PlatoPrincipal {

    //Atributos
    public int id;
    public String nombrePlato;
    public int precio;
    public int cantidad;

    public PlatoPrincipal(String nombrePlato, int precio, int cantidad) {
        this.nombrePlato = nombrePlato;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    public PlatoPrincipal(int id, String nombrePlato, int precio, int cantidad) {
        this.id = id;
        this.nombrePlato = nombrePlato;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    

}
