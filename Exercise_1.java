
public class Exercise_1 {

   
    public static void main(String[] args) {
        
        //estancia 
        Exercise_1 ex = new Exercise_1();
        ex.facorial(5);
        //salida de factorial 1
        System.out.println(ex.facorial(5));
       
        // salida del factorial 2
        System.out.println(ex.factorial_2(5));
     
    }
    
    // factoria recursivo
    public int factorial_2(int n){
        if(n==0 || n==1){
            return 1;
        }
        return factorial_2(n-1)*n;
    }
      // es un metodo
    public  int facorial (int n){
        int aux = 1;
        for (int a=1; a<=n; a++){
            aux = aux*a;
            
        }
        return aux;
    }
    
}
