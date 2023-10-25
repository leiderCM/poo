
package implementacion.modelo;



public class Main {
    public static void main(String[] args) {
         // Crear instancias de las formas

         Cuadrado miCuadrado = new Cuadrado(5,3,2);
         Circulo miCirculo = new Circulo(3,3,5);
         Triangulo miTriangulo = new Triangulo(3,4,5,4,6,8,6,4);
         Rectangulo miRectangulo = new Rectangulo(3,2,7,8);
         
        // Calcular y mostrar áreas y perímetros
        System.out.println("Area del cuadrado: " + miCuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: " + miCuadrado.calcularPerimetro());
        System.out.println("Altura del cuadrado: " + miCuadrado.calcularAltura());
         miCuadrado.trasladar(3, 4);
         System.out.println("Nueva posicion del cuadrado - area: " + miCuadrado.calcularArea());

        System.out.println("Coordenadas originales del cuadrado: (" + miCuadrado.getX() + ", " + miCuadrado.getY() + ")");
        miCuadrado.reflejarEnEje("horizontal");
        System.out.println("Coordenadas despues de la reflexion en eje horizontal: (" + miCuadrado.getX() + ", " + miCuadrado.getY() + ")");
        miCuadrado.reflejarEnEje("vertical");
        System.out.println("Coordenadas despues de la reflexion en eje vertical: (" + miCuadrado.getX() + ", " + miCuadrado.getY() + ")");
        //calculamos circulo
        System.out.println("Area del circulo: " + miCirculo.calcularArea());
        System.out.println("Perimetro del circulo: " + miCirculo.calcularPerimetro());
        System.out.println("Altura del circulo: " + miCirculo.calcularAltura());
        miCirculo.trasladar(2, 5);
        System.out.println("Nueva posición del circulo - area: " + miCirculo.calcularArea());
        System.out.println("Coordenadas originales del circulo: (" + miCirculo.getX() + ", " + miCirculo.getY() + ")");
        miCuadrado.reflejarEnEje("horizontal");
        System.out.println("Coordenadas despues de la reflexión en eje horizontal: (" + miCirculo.getX() + ", " + miCirculo.getY() + ")");
        miCuadrado.reflejarEnEje("vertical");
        System.out.println("Coordenadas despues de la reflexion en eje vertical: (" + miCirculo.getX() + ", " + miCirculo.getY() + ")");
         
        //calculamos el trinagulo
        System.out.println("Area del triangulo: " + miTriangulo.calcularArea());
        System.out.println("Perimetro del triangulo: " + miTriangulo.calcularPerimetro());
        System.out.println("Area del triangulo: " + miTriangulo.calcularAltura());
        miTriangulo.trasladar(3, 10);
        System.out.println("Nueva posición del triangulo - area: " + miTriangulo.calcularArea());
        System.out.println("Coordenadas originales del triangulo: (" + miTriangulo.getX() + ", " + miTriangulo.getY() + ")");
        miCuadrado.reflejarEnEje("horizontal");
        System.out.println("Coordenadas despues de la reflexión en eje horizontal: (" + miTriangulo.getX() + ", " + miTriangulo.getY() + ")");
        miCuadrado.reflejarEnEje("vertical");
        System.out.println("Coordenadas despues de la reflexion en eje vertical: (" + miTriangulo.getX() + ", " + miTriangulo.getY() + ")");
        //calculamos rectangulo
        System.out.println("Area del rectangulo: " + miRectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo: " + miRectangulo.calcularPerimetro());
        System.out.println("Altura del rectangulo: " + miCuadrado.calcularPerimetro());
        miRectangulo.trasladar(10, 3);
        System.out.println("Nueva posicion del Rectangulo - area: " + miRectangulo.calcularArea());
        System.out.println("Coordenadas originales del rectangulo: -" + miRectangulo.getX() + ", - " + miRectangulo.getY() + ")");
        miCuadrado.reflejarEnEje("horizontal");
        System.out.println("Coordenadas despues de la reflexion en eje horizontal: (" + miRectangulo.getX() + ", " + miRectangulo.getY() + ")");
        miCuadrado.reflejarEnEje("vertical");
        System.out.println("Coordenadas despues de la reflexion en eje vertical: (" + miRectangulo.getX() + ", " + miRectangulo.getY() + ")");
         
        
        
    }
    
}
