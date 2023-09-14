
package saved.saved;
//importamso la el paquete y la clase 
import animal.Animal;
import animal.Caballo;
import animal.Gato;
import animal.Perro;
import animal.Elefante;
import animal.Girafa;
public class main {

    //el main principal 
    public static void main(String[] args) {
        //creamos el objeto de girafa 
        Animal girafa =new Girafa("lupe","omnivoro",34,"camelopardalis");
        girafa.mostrar();
        girafa.Alimentarse();
       
        System.out.println("-------------------------------------");



        //declaracion del objeto ELEFANTE 
        Animal elefante = new Elefante("sofia","omnivoro",23,"laxonta");
        elefante.mostrar();
        elefante.Alimentarse();
        System.out.println("-------------------------------------");
        //-->Declaracion del objeto PERRO
        Animal perro = new Perro("Stich","Carnivoro",15,"Doberman");
        perro.mostrar();
        perro.Alimentarse();
        System.out.println("---------------------------------------");
       
        //-->Declaracion de otro objeto PERRO
        Perro perro1 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro1.mostrar();
        perro1.Alimentarse();
         System.out.println("---------------------------------------");


        //-->Declaracion del objeto Gato
        Animal gato = new Gato("Pelusa","Galletas",15,"Siames");
        gato.mostrar();
        gato.Alimentarse();
        System.out.println("---------------------------------------");
        //-->Declaracion del objeto Caballo
        Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.mostrar();
        caballo.Alimentarse();
        
        
        
        
    }
    
}
