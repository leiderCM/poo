
package excercise_class;
import call.unicauca.edu.co.ax_artt;

public class Excercise_class {

    
    public static void main(String[] args) {
        
        ax_artt artt = new ax_artt();
        
        System.out.println("Access var:");
        System.out.println("Name import "+ artt.name);
        System.out.println("importar year "+ artt.year_hbd);
        //podemos cambiar el nombre de la variable que se llama camilo
        // que se encuentra en otra clase axa_att
        artt.name = "camilo";
        System.out.println("cambiamos nombre "+artt.name);
        System.out.println("importar year "+ artt.year_hbd);
    }
    
}
