
package animal;

public class Caballo extends Animal {

    String raza;
    //creamos el metodo 
    public Caballo(String nombre, String tipo_alimentacion, int edad,String raza) {
        super(nombre, tipo_alimentacion, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void mostrar(){
        System.out.println(getNombre() + "-"+getTipo_alimentacion()+"-"+getEdad()+"-"+getRaza());
    }

    @Override
    public void Alimentarse() {
        System.out.println("Me alimento de hierbas");
    }
   
}

