
package animal;

public abstract class Animal {
    //atributos 
    private String nombre; String tipo_alimentacion;
    private int edad;
       //creamos el costructor 
    public Animal(String nombre, String tipoAlimento, int edad) {
        this.nombre = nombre;
        this.tipo_alimentacion = tipoAlimento;
        this.edad = edad;
    }
    // es el metodo que saca por pantalla lo que el animal come 
    public abstract void Alimentarse();
    public abstract void mostrar();
   
    //set y get 
    public String getNombre() {
        return nombre;
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo_alimento(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    } 
    
}
