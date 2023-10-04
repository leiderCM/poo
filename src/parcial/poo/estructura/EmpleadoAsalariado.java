
package parcial.poo.estructura;


public class EmpleadoAsalariado extends Empleado {
   
    private double deducciones;
    private String nombre;
    public EmpleadoAsalariado(){
        
        deducciones=0;
    }
    public EmpleadoAsalariado( String nombre,double deducciones) {
        this.nombre=nombre;
        this.deducciones = deducciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public  double calaularSalarioEmpleado(){
          double salarioAsalariado;
          salarioAsalariado=salarioBase-deducciones;
          return salarioAsalariado;
    }
    
}
