
package formaGeometrica;


public class triangulo extends forma_geometrica{
    
    private double base;
    private double altura;
    //costructor
    public triangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
   
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
    
    
}
