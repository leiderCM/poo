
package parcial.poo;

import java.util.ArrayList;
import java.util.List;
import parcial.poo.estructura.Empleado;
import parcial.poo.estructura.EmpleadoAsalariado;
import parcial.poo.estructura.EmpleadoPorHoras;


public class Main {

    
    public static void main(String[] args) {
       
        List<Empleado> empleadosT = new ArrayList<>();

        //lista de empleados asalariados
        EmpleadoAsalariado salarioAsalariado1 = new EmpleadoAsalariado("leider",5000);
        EmpleadoAsalariado salarioAsalariado2 = new EmpleadoAsalariado("segundo",50);
        EmpleadoAsalariado salarioAsalariado3 = new EmpleadoAsalariado("der",54);
        EmpleadoAsalariado salarioAsalariado4 = new EmpleadoAsalariado("elva",4000);
        EmpleadoAsalariado salarioAsalariado5 = new EmpleadoAsalariado("lola",6000);
        // lista de empleados por hora
        EmpleadoPorHoras salarioEmpleado1 = new EmpleadoPorHoras("sebas",3,3000);
        EmpleadoPorHoras salarioEmpleado2 = new EmpleadoPorHoras("lucas",6,3000);
        EmpleadoPorHoras salarioEmpleado3 = new EmpleadoPorHoras("luis",7,3000);
        EmpleadoPorHoras salarioEmpleado4 = new EmpleadoPorHoras("daniel",12,3000);
        EmpleadoPorHoras salarioEmpleado5 = new EmpleadoPorHoras("flaco",15,3000);
        //guandamos en la lista los empleados
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
        
        for(Empleado E :empleado){
            System.out.println(E.toString());
            System.out.println(E.calaularSalarioEmpleado());
        }
        System.out.println("\n---Empleados solo por hora modificado en la pocicion 4---------------\nCambiamos daniel por carlos");
        //  aqui modificamos la pocicion  del empleado por horas
        EmpleadoPorHoras nuevoEmpleado = new EmpleadoPorHoras("Carlos", 40,999);
        empleado.set(8, nuevoEmpleado);
        //aqui creamos un Array list para almacenar los ultimos 5 ultimos empleados 
        List<Empleado> EmpleadosPorHoras = new ArrayList<>();
        int cantidadPociciones=empleado.size();
        // en esta parte se extrae el tamaño del array 
        // el for comienza de 5 porque de hay es que quiero que obtenga la informacion de 5 en adelante
        for(int i=5;i<cantidadPociciones;i++){
            EmpleadosPorHoras.add(empleado.get(i));
        }
        //se muestra la lista de empleados por horas guardadas
        for(Empleado y : EmpleadosPorHoras){
            System.out.println(y.toString());
            System.out.println("salrio: "+y.calaularSalarioEmpleado());
        }
        //empleado que quiero encontrar
        String empleadoBuscar="jeison";
        System.out.println("\nEl empleado a buscar es: "+empleadoBuscar);
        Empleado empleadoEncontrado=null;
        //optener un empleado especifico, a la variable se le busca getnombre 
        // y se lo compara con empleado a buscar
        for(Empleado empleadoE: empleado){
            if(empleadoE.getNombre().equals(empleadoBuscar)){                
                empleadoEncontrado=empleadoE;
                break;
            }
        }
        // sale por pantalla el empleado a buscar 
        System.out.println("\nEmpleado en especifico encontrado: "+empleadoEncontrado);  
        System.out.println("salario : "+empleadoEncontrado.calaularSalarioEmpleado());  
    }   
        
    }
    
}
