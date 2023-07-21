/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package restaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import jugo.Jugo;
import platoPrincipal.PlatoPrincipal;
import postre.Postre;
import sopa.Sopa;

/**
 *
 * @author CAMILO
 */
public class Restaurante {

    static int opcion;
    static Scanner entrada = new Scanner(System.in);
    static List<PlatoPrincipal> platosPrincipales = new ArrayList<PlatoPrincipal>();
    static List<Sopa> sopas = new ArrayList<Sopa>();
    static List<Jugo> jugos = new ArrayList<Jugo>();
    static List<Postre> postres = new ArrayList<Postre>();

    public static void main(String[] args) {
        while (opcion != 3) {
            System.out.println("****Bienvenidos*****");
            System.out.println("****Restaurante Sena*****");
            System.out.println("1. Crear menu");
            System.out.println("2. ver menu");
            System.out.println("3. Salir");
            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    //crear menu
                    crearMenu();
                    break;

                case 2:
                    //ver menu
                    verMenu();
                case 3:

                    break;
                default:
                    throw new AssertionError();
            }

        }

    }

    private static void crearMenu() {
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("1. Platos Principales");
            System.out.println("2. Sopas");
            System.out.println("3. Jugos");
            System.out.println("4. Postres");
            System.out.println("5. Atras");
            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Nombre Plato");
                    String nombre = entrada.nextLine();
                    System.out.println("Precio ");
                    int precio = Integer.parseInt(entrada.nextLine());
                    System.out.println("Cantidad ");
                    int cantidad = Integer.parseInt(entrada.nextLine());
                    PlatoPrincipal platillo = new PlatoPrincipal(nombre, precio, cantidad);
                    platosPrincipales.add(platillo);
                    break;

                case 2:
                    System.out.println("Nombre Sopa");
                    String nombreSopa = entrada.nextLine();
                    System.out.println("Precio");
                    int precioSopa = Integer.parseInt(entrada.nextLine());
                    System.out.println("Cantidad");
                    int cantidadSopa = Integer.parseInt(entrada.nextLine());
                    Sopa sopilla = new Sopa(nombreSopa, precioSopa, cantidadSopa);
                    sopas.add(sopilla);

                    break;
                case 3:
                    System.out.println("Nombre Jugo");
                    String nombreJugo = entrada.nextLine();
                    System.out.println("Precio");
                    int precioJugo = Integer.parseInt(entrada.nextLine());
                    System.out.println("Cantidad");
                    int cantidadJugo = Integer.parseInt(entrada.nextLine());
                    Jugo juguillo = new Jugo(nombreJugo, precioJugo, cantidadJugo);
                    jugos.add(juguillo);
                    juguillo.Preparar(); //llamar un metodo

                    break;
                case 4:
                    System.out.println("Nombre Postre");
                    String nombrePostre = entrada.nextLine();
                    System.out.println("Precio");
                    int precioPostre = Integer.parseInt(entrada.nextLine());
                    System.out.println("Cantidad");
                    int cantidadPostre = Integer.parseInt(entrada.nextLine());
                    Postre postrecillo = new Postre(nombrePostre, precioPostre, cantidadPostre);
                    postres.add(postrecillo);

                    break;
                case 5:
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

    private static void verMenu() {

        System.out.println("Menu del dia ");
        System.out.println("\n");
        System.out.println("Platos Principales");
        System.out.println("Nombre \t Precio\t Cantidad");
        platosPrincipales.forEach(platosPrincipales -> {
            System.out.println(platosPrincipales.nombrePlato + "\t\t" + platosPrincipales.precio + "\t" + platosPrincipales.cantidad);
        });

        System.out.println("\n");
        System.out.println("Sopas ");;
        System.out.println("Nombre \t Precio\t Cantidad");
        sopas.forEach(sopas -> {
            System.out.println(sopas.nombreSopa + "\t\t" + sopas.precioSopa + "\t" + sopas.cantidadSopa);
        });

        System.out.println("\n");
        System.out.println("Jugos ");;
        System.out.println("Nombre \t Precio\t Cantidad");
        jugos.forEach(jugos -> {
            System.out.println(jugos.nombreJugo + "\t\t" + jugos.precioJugo + "\t" + jugos.cantidadJugo);
        });

        System.out.println("\n");
        System.out.println("Postres ");;
        System.out.println("Nombre \t Precio\t Cantidad");
        postres.forEach(postres -> {
            System.out.println(postres.nombrePostre+ "\t\t" + postres.precioPostre + "\t" + postres.cantidadPostre);
        });

    }
}
