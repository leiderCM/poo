
package implementacion.modelo;

import implementacion.modelo.interfaces.Forma;
import static java.lang.Math.sqrt;

class Cuadrado implements Forma{
    private double lado;
    private double x; 
    private double y;

    public Cuadrado(double lado,double x, double y) {
        this.lado = lado;
        this.x = x;
        this.y = y;
        
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    @Override
    public void trasladar(double deltaX, double deltaY) {
        // Aplicar la traslación sumando los desplazamientos a las coordenadas del centro
        this.x += deltaX;
        this.y += deltaY;
    }
     @Override
    public double calcularAltura() {
        return sqrt(2*(lado*lado)) ;
    }
   
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
     @Override
    public void reflejarEnEje(String eje) {
        if (eje.equals("vertical")) {
            
            this.y = -this.y;
        } else if (eje.equals("horizontal")) {
            
            this.x = -this.x;
        }
    }
    

}
