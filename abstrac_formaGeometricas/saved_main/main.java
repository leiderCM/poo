
package saved_main;
import formaGeometrica.circle;
import formaGeometrica.cuadrado;
import formaGeometrica.triangulo;
import formaGeometrica.elipce;
public class main {
    
    public static void main(String[] args) {
     
        //creamos un objero circulo 
        circle  circulo = new circle(6.5);
        //calcular el area del circulo 
        double area =circulo.calcularArea();
        System.out.println("el area del circulo es de "+area);
       
        //cuafrado 
        // creo el objeto
        cuadrado Cuadrado=new cuadrado(4);
        double Acuadrada =Cuadrado.calcularArea();
        System.out.println("el area del cuadrado es "+Acuadrada);
        
        //creo el objeto de triangulo
        triangulo Tria =new triangulo(2,4);
        double areaTrian = Tria.calcularArea();
        System.out.println("area del triangulo "+areaTrian);
        
        //creamos el objeto de elipce 
        elipce elip =new elipce(4,5);
        double Elipce= elip.calcularArea();
        System.out.println("area del elipce "+Elipce);
        
    }
    
}
