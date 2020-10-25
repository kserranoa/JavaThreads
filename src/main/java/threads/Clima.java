/*
El clima va a cambiar cada 2 minutos, pero el cambio de clima se va a realizar en la class Generador
*/
package threads;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Clima {
    double velocidad; 

    //Constructor para velocidad 
    public Clima(double velocidad) {
        this.velocidad = velocidad;
    }
    
    //Metodo para establecer la velocidad
    public void establecerVelocidad(){
        /*
        De manera aleatoria va a escoger una velocidad del clima (rapido 30, intermedio 40, normal 60 y lento 90)
        */
        List<Integer> lista = Arrays.asList(30, 40, 60, 90);
        Random aleatorio = new Random();
        int r = lista.get(aleatorio.nextInt(lista.size()));
        double velocidad = r;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }   
    
}
