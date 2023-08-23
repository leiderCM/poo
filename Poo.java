/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author IngSis
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int edad = 25;
        double temperatura = 98.6;
        char calificacion = 'A';
        boolean activo = true;
        String nombre = "leider ceron";
        System.out.println("Hola" + nombre);
        System.out.println();

        //generamos instance
        Poo miinstance = new Poo();
        int resul=miinstance.sum(7,8);
        System.out.println(resul);
        //forma2
        miinstance.sum(3, 4);

    }

    public int sum(int num1, int num2) {

        // System.out.println("resultado:" + (num1 + num2));
        return (num1+num2);

    }
}
