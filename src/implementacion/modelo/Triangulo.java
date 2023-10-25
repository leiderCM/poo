
package implementacion.modelo;

import implementacion.modelo.interfaces.Forma;


public class Triangulo implements Forma {
    private double base,altura,area;
    private double lado1,lado2,lado3;
    private double x,y;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3,double area,double x, double y) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.area=area;
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
        return (2*area)/base ;
    }
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
    
    @Override
    public double calcularPerimetro(){
        return lado1+lado2+lado3;
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
