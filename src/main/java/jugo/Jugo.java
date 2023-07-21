/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugo;

/**
 *
 * @author CAMILO
 */
public class Jugo {
    public int id;
    public String nombreJugo;
    public int precioJugo;
    public int cantidadJugo;
    public int litrosJugo;

    public Jugo(String nombreJugo, int precioJugo, int cantidadJugo) {
        this.nombreJugo = nombreJugo;
        this.precioJugo = precioJugo;
        this.cantidadJugo = cantidadJugo;
    }

    public Jugo(int id, String nombreJugo, int precioJugo, int cantidadJugo) {
        this.id = id;
        this.nombreJugo = nombreJugo;
        this.precioJugo = precioJugo;
        this.cantidadJugo = cantidadJugo;
    }

  

    public void Preparar() {
        this.litrosJugo = cantidadJugo * 2;
    }
}
