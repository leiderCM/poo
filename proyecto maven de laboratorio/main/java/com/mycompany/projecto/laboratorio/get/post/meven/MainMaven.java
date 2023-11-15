

package com.mycompany.projecto.laboratorio.get.post.meven;
import static spark.Spark.*;

public class MainMaven {

    public static void main(String[] args) {
        //rep es mandar una peticion y res cuando le reponde de donde tambien es la respuesta res
        get("cualessunombre",(req, res)->"leyder ceron muñoz");
        //mandar con parametros el get 
        get("/sumar/:a/:b",(req,res)->{
         int parametroA = Integer.parseInt(req.params(":a"));
         int parametroB = Integer.parseInt(req.params(":b"));
         
         
         return sum(parametroA,parametroB);
        });
        // cramos otro spark, otro ger para la resta
        get("/resta/:t/:m",(req,res)->{
            int var1 = Integer.parseInt(req.params(":t"));
            int var2 = Integer.parseInt(req.params(":m"));
            
            return resta(var1,var2);
        });
        //creamos otro spark, para la multiplicacion 
        get("/multiplicacion/:w/:y",(req, res)->{
            float milti1=Integer.parseInt(req.params(":w"));
            float milti2=Integer.parseInt(req.params(":y"));
            
            return multiplicacion(milti1,milti2);
        });
        //creamos otro spark, get para la divicion
        get("/divicion/:p/:x",(req,res)->{
            float divi1=Integer.parseInt(req.params(":p"));
            float divi2=Integer.parseInt(req.params(":x"));
            
            return divicion(divi1, divi2);
        });
        
        
    }
    //metodo par la divicion
    public static float divicion(float p,float o){
        return p/o;
    }
    //metodo dela multiplicacion
    public static float multiplicacion(float w,float y){
        return w*y;
    }
    //metodo de la suma 
    private static int sum(int a, int b){
        return a+b;
    }   
    //metodo de la resta
    public static int resta(int t,int m){
        return t-m;
    }
    
}
