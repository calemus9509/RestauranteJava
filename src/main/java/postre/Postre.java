/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postre;

/**
 *
 * @author CAMILO
 */
public class Postre {
    public int id;
    public String nombrePostre;
    public int precioPostre;
    public int cantidadPostre;

    public Postre(String nombrePostre, int precioPostre, int cantidadPostre) {
        this.nombrePostre = nombrePostre;
        this.precioPostre = precioPostre;
        this.cantidadPostre = cantidadPostre;
    }

    public Postre(int id, String nombrePostre, int precioPostre, int cantidadPostre) {
        this.id = id;
        this.nombrePostre = nombrePostre;
        this.precioPostre = precioPostre;
        this.cantidadPostre = cantidadPostre;
    }
    
    
}
