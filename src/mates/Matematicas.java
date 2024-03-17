package mates;

import java.util.Random;
import java.util.function.DoubleSupplier;

public class Matematicas {
   
    public static double generarNumeroPi(long pasos) {
        
        // Se crea una instancia de la clase Random para generar números aleatorios
        Random rand = new Random();


         // Contador para almacenar la cantidad de puntos dentro del círculo
        long puntosEnCirculo = 0;

           // Expresión lambda que representa un proveedor de valores double
        
        DoubleSupplier generadorPunto = () -> rand.nextDouble();

       // Se generan pasos puntos aleatorios y se cuenta cuántos caen dentro del círculo
        for (long i = 0; i < pasos; i++) {


            double x = generadorPunto.getAsDouble(); 
            double y = generadorPunto.getAsDouble();

            // Comprueba si el punto (x, y) está dentro del círculo usando la ecuación del círculo

            if (x * x + y * y <= 1) {
                puntosEnCirculo++;
            }
        }
        

         // Calcula la aproximación de pi usando la relación entre el área del círculo y el área del cuadrado

   
        return 4.0 * puntosEnCirculo / pasos;
    }
}

