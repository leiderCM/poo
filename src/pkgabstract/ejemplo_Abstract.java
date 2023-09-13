
package pkgabstract;




    // clase abtracta que define una forma geometrica generica
    abstract class formaGeometrica{
        //metodo abstracto para calcular el area
        public abstract double calcularArea();
    }
   //clase concreata que existe de la forma geometrica 
    class Circulo extends formaGeometrica{

        private  double radio;

        public Circulo(double radio){
            this.radio=radio;
        }
        //con esto se puede   sobre escribir
        @Override
        public double calcularArea(){
            return Math.PI*radio*radio;
        }
    }

public class ejemplo_Abstract {
    
    public static void main(String[] args) {
     
        //creamos un objero circulo 
        Circulo circulo = new Circulo(6.5);
        //calcular el area del circulo 
        double area =circulo.calcularArea();
        System.out.println("el area del circulo es de "+area);
        
    }
    
}
