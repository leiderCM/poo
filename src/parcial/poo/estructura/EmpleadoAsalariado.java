
package parcial.poo.estructura;


public class EmpleadoAsalariado extends Empleado {
   
    private double deducciones;
    
   public EmpleadoAsalariado(String nombre, double deducciones ){
       super(nombre);
       this.deducciones=deducciones;
   }
   
    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }
    
    @Override
    public  double calaularSalarioEmpleado(){
        double salarioAsalariado;
        salarioAsalariado=salarioBase-deducciones;
        return salarioAsalariado;
    }

    @Override
    public String toString() {
        return "\nnombre:"+nombre+"\ndeducciones:"+deducciones;
    }
    
}
