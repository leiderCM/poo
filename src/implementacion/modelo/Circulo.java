
package implementacion.modelo;
// Implementación para un círculo

import implementacion.modelo.interfaces.Forma;

class Circulo implements Forma {
    private double radio;
    private double x; 
    private double y;

    public Circulo(double radio, double x, double y) {
        this.radio = radio;
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
        return 2* radio ;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
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

    
    

