
package animal;

// la estendimos a animal
public class Girafa extends Animal {
    String raza;
    
    public Girafa(String nombre,String tipo_alimentacion,int edad, String raza){
        super(nombre,tipo_alimentacion,edad);
        this.raza=raza;
        
    }
    public String getRaza(){
        return raza;
    }
    
    public void setRaza(String raza){
        this.raza=raza;
    }
    @Override
    public void mostrar(){
       System.out.println(getNombre()+"--"+getTipo_alimentacion()+"--"+getEdad()+"--"+getRaza());
    }
    @Override
    public void Alimentarse(){
        System.out.println("me alimento de ramas solo altas ");
    }
    
    
}
