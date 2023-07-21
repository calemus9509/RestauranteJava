/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopa;

/**
 *
 * @author CAMILO
 */
public class Sopa {
    public int id;
    public String nombreSopa;
    public int precioSopa;
    public int cantidadSopa;
   

  

    public Sopa(String nombreSopa, int PrecioSopa, int cantidadSopa) {
        this.nombreSopa = nombreSopa;
        this.precioSopa = precioSopa;
        this.cantidadSopa = cantidadSopa;
    }

    public Sopa(int id, String nombreSopa, int precioSopa, int cantidadSopa) {
        this.id = id;
        this.nombreSopa = nombreSopa;
        this.precioSopa = precioSopa;
        this.cantidadSopa = cantidadSopa;
    }

    

}
