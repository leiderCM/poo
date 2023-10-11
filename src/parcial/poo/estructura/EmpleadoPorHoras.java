
package parcial.poo.estructura;


public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifasPorHoras;
  
    
    //costructor con parametros
    public EmpleadoPorHoras(String nombre ,int horasTrabajadas, double tarifasPorHoras) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifasPorHoras = tarifasPorHoras;
        
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifasPorHoras() {
        return tarifasPorHoras;
    }

    public void setTarifasPorHoras(double tarifasPorHoras) {
        this.tarifasPorHoras = tarifasPorHoras;
    }
    @Override
    public  double calaularSalarioEmpleado(){
        double salario;
           salario=horasTrabajadas*tarifasPorHoras;
        
        return salario;
    }

    @Override
    public String toString() {
        return "\nnombre: "+nombre+"\nHoras trabajadas: "+horasTrabajadas+"\ntarifas por horas:"+tarifasPorHoras;
    }
}
