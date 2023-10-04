/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.poo.estructura;

/**
 *
 * @author Leider Ceron
 */
public class EmpleadoPorHoras {
    private int horasTrabajadas;
    private double tarifasPorHoras;
    private String nombre;
    //costructor vacio
    public EmpleadoPorHoras(){
        horasTrabajadas=0;
        tarifasPorHoras=0;
    }
    //costructor con parametros
    public EmpleadoPorHoras(String mombre,int horasTrabajadas, double tarifasPorHoras) {
        this.horasTrabajadas = horasTrabajadas;
        this.tarifasPorHoras = tarifasPorHoras;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public  double calaularSalarioEmpleado(){
        double salario;
           salario=horasTrabajadas*tarifasPorHoras;
        
        return salario;
    }
    
    
    
    
}
