
package parcial.poo;

import java.util.ArrayList;
import java.util.List;
import parcial.poo.estructura.Empleado;
import parcial.poo.estructura.EmpleadoAsalariado;
import parcial.poo.estructura.EmpleadoPorHoras;


public class Main {

    
    public static void main(String[] args) {
       
        List<Empleado> empleadosT = new ArrayList<>();
        
         
        
        
        //empleado por horas
        EmpleadoAsalariado salarioAsalariado1 = new EmpleadoAsalariado("leider",5000);
        EmpleadoAsalariado salarioAsalariado2 = new EmpleadoAsalariado("segundo",50);
        EmpleadoAsalariado salarioAsalariado3 = new EmpleadoAsalariado("der",54);
        EmpleadoAsalariado salarioAsalariado4 = new EmpleadoAsalariado("elva",4000);
        EmpleadoAsalariado salarioAsalariado5 = new EmpleadoAsalariado("lola",6000);
        // empleado por horas 
        EmpleadoPorHoras salarioEmpleado1 = new EmpleadoPorHoras("sebas",3,3000);
        EmpleadoPorHoras salarioEmpleado2 = new EmpleadoPorHoras("lucas",6,3000);
        EmpleadoPorHoras salarioEmpleado3 = new EmpleadoPorHoras("luis",7,3000);
        EmpleadoPorHoras salarioEmpleado4 = new EmpleadoPorHoras("daniel",12,3000);
        EmpleadoPorHoras salarioEmpleado5 = new EmpleadoPorHoras("flaco",15,3000);
        //guandamos en la lista los empleados
        empleadosT.add(salarioAsalariado1);
        empleadosT.add(salarioAsalariado2);
        empleadosT.add(salarioAsalariado3);
        empleadosT.add(salarioAsalariado4);
        empleadosT.add(salarioAsalariado5);
        //empleados por hora
       
        for(Empleado Empleados:empleadosT){
            System.out.println("empleados "+Empleados);
        }
        
        
        
        
    }
    
}
