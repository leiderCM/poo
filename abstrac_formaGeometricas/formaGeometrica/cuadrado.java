
package formaGeometrica;


public class cuadrado extends forma_geometrica {
    
    private double lado;
    
    public cuadrado(double lado){
        this.lado=lado;
    }
    
    @Override 
    public double calcularArea(){
        return lado*lado;
    }
}
