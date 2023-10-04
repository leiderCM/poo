
package parcial.poo.estructura;


public abstract class Empleado {
    protected double salarioBase;
    
    public Empleado(){
        salarioBase=1000000;
    }
    public Empleado(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    public abstract double calaularSalarioEmpleado();
    
    
        
        
        
    
}
