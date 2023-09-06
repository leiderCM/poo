package pkg060923;
import exercise.Persona;

public class Main {

    public static void main(String[] args) {
        //creamos el array
        Persona[] arrayperson = new Persona[3];
        
        arrayperson[0] = new Persona("lucas ", "notis","23434234");
        arrayperson[1] = new Persona("luiz ", "notis4","234342904");
        arrayperson[2] = new Persona("li ", "notis3","2343423004");
           //ciclo for para para la salidad cada persona y sus datos 
                                    //LENGTH 
        for(int t=0; t<arrayperson.length; t++){
            System.out.println(arrayperson[t].getFirstName()); 
            System.out.println(arrayperson[t].getLastName()); 
            System.out.println(arrayperson[t].getDocument()); 
          System.out.println("-----------------------------");
        }
        /*
        // creamos la estancia del otro paquete 
        Persona person = new Persona("leider", "Minota", "1004674956");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getDocument());
        
        // modificamos el nombre
        person.setFirstName("sebas"); 
        
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getDocument());
        
        // creamos un array
        */
    }

}
