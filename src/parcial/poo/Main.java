
package parcial.poo;

import java.util.ArrayList;
import java.util.List;
import parcial.poo.estructura.Empleado;
import parcial.poo.estructura.EmpleadoAsalariado;
import parcial.poo.estructura.EmpleadoPorHoras;


public class Main {

    
    public static void main(String[] args) {
       
       List<Empleado> empleado = new ArrayList<>();
        //CREAMOS EMPLEADOS ASALARIADOS
      EmpleadoAsalariado empleado1 = new EmpleadoAsalariado("leider",500);
        EmpleadoAsalariado empleado2 = new EmpleadoAsalariado("segundo",50);
        EmpleadoAsalariado empleado3 = new EmpleadoAsalariado("sara",54);
        EmpleadoAsalariado empleado4 = new EmpleadoAsalariado("elva",400);
        EmpleadoAsalariado empleado5 = new EmpleadoAsalariado("lola",600);
        // empleado por horas 
        EmpleadoPorHoras empleado6 = new EmpleadoPorHoras("sebas",3,45000);
        EmpleadoPorHoras empleado7 = new EmpleadoPorHoras("lucas",6,65000);
        EmpleadoPorHoras empleado8 = new EmpleadoPorHoras("luis",7,76000);
        EmpleadoPorHoras empleado9 = new EmpleadoPorHoras("daniel",12,23000);
        EmpleadoPorHoras empleado10 = new EmpleadoPorHoras("jeison",15,30000);
        //guandamos en la lista los empleados y le samos salida por pantalla
        System.out.println("-----Empleados completos sin modificar-----");
        empleado.add(empleado1);
        empleado.add(empleado2);
        empleado.add(empleado3);
        empleado.add(empleado4);
        empleado.add(empleado5);
        empleado.add(empleado6);
        empleado.add(empleado7);
        empleado.add(empleado8);
        empleado.add(empleado9);
        empleado.add(empleado10);
        //se muestra los empleados acumulados
        for(Empleado E :empleado){
            System.out.println(E.toString());
            System.out.println("salario: "+E.calaularSalarioEmpleado());
        }
        System.out.println("\n---Empleados solo por hora modificado en la pocicion 4---------------\nCambiamos daniel por carlos");
        //  aqui modificamos la pocicion 0 cambiando el nombre y en las decucciones saveee
        EmpleadoPorHoras nuevoEmpleado = new EmpleadoPorHoras("Carlos", 40,10000);
        empleado.set(8, nuevoEmpleado);
        //aqui creamos un Array list para almacenar los ultimos 5 objetos 
        List<Empleado> EmpleadosPorHoras = new ArrayList<>();
        int cantidadPociciones=empleado.size();
        // en esta parte se extrae el tamaño del array y se pone 5 como se ve en las varibles
        // el for comienza de 5 porque de hay es que quiero que obtenga la informacion
        for(int i=5;i<cantidadPociciones;i++){
            EmpleadosPorHoras.add(empleado.get(i));
        }
        //se muestra la lista de empleados por horas 
        for(Empleado y : EmpleadosPorHoras){
            System.out.println(y.toString());
            System.out.println("salrio: "+y.calaularSalarioEmpleado());
        }
        //empleado que quiero encontrar
        String empleadoBuscar="jeison";
        System.out.println("\nEl empleado a buscar es: "+empleadoBuscar);
        Empleado empleadoEncontrado=null;
        //optener un empleado especifico a la variable se le busca getnombre 
        // y se lo compara con empleado a buscar
        for(Empleado empleadoE: empleado){
            if(empleadoE.getNombre().equals(empleadoBuscar)){                
                empleadoEncontrado=empleadoE;
                
                break;
            }
        }
        System.out.println("\nEmpleado en especifico encontrado: "+empleadoEncontrado);  
        System.out.println("salario : "+empleadoEncontrado.calaularSalarioEmpleado());  
    }   

    
}
