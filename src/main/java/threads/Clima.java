/*
El clima va a cambiar cada 2 minutos
*/
package threads;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Clima {
    double velocidad; 
    
    public void establecerVel(){
        /*
        De manera aleatoria va escoger una velocidad del clima (rapido 30, intermedio 40, normal 60 y lento 90)
        */
         List<Integer> lista = Arrays.asList(30, 40, 60, 90);
        Random aleatorio = new Random();
        int r = lista.get(aleatorio.nextInt(lista.size()));
        double velocidad = r;
    }
    
    
}
