
package implementacion.modelo;

import implementacion.modelo.interfaces.Forma;
import static java.lang.Math.sqrt;


public class Rectangulo implements Forma {
    private double lado1,lado2;
     private double x,y; 


    public Rectangulo(double lado1, double lado2, double x, double y) {
        this.lado1 = lado1;
        this.lado2 = lado2;
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
        return sqrt((lado1*lado1)+(lado2*lado2));
    }
    
     @Override
    public double calcularArea(){
        return lado1*lado2;
    }
    
    @Override
    public double calcularPerimetro(){
        return (lado1*2)+(lado2*2);
    }

    private double sqt(double par) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
