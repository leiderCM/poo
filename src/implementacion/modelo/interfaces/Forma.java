package implementacion.modelo.interfaces;


public interface Forma {

    double calcularArea();

    double calcularPerimetro();
    
    double calcularAltura();
    
    void trasladar(double deltaX, double deltaY);
    
    void reflejarEnEje(String eje);
    
}
