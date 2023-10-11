
package parcial.poo.estructura;


public abstract class Empleado {
    protected double salarioBase;
     private String nombre;
    public Empleado(){
        salarioBase=1000000;
    }
    public Empleado(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    public abstract double calaularSalarioEmpleado();

    public String getNombre(){
       return nombre;
   }

    
}
