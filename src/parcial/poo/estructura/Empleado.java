
package parcial.poo.estructura;


public abstract class Empleado {
    protected String nombre;
    protected double salarioBase=1000000;
 
    public Empleado(String nombre) {
        this.nombre= nombre;  
    }
    //metodo calcular salario abstracto
    public abstract double calaularSalarioEmpleado();

   public String getNombre(){
       return nombre;
   }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }      
    
}
