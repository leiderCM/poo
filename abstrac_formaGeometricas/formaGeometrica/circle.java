
package formaGeometrica;


public class circle extends forma_geometrica{
    
    private double radio;
    //costructor
    public circle(double radio){
        this.radio=radio;
    }
    //con esto se puede sobre escribir
    @Override
    public double calcularArea(){
        return Math.PI*radio*radio;
    }
    
    
}