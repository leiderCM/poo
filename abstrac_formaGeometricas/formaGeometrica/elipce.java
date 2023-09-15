
package formaGeometrica;


public class elipce extends forma_geometrica{
    private double longitud1;
    private double longitud2;
    
    //creamos el costructor 
    public elipce(double longitud1, double longitud2){
        this.longitud1=longitud1;
        this.longitud2=longitud2;
    }
    
    @Override
    public double calcularArea(){
        return (longitud1*longitud2)*Math.PI;
    }
    
    
    
}
