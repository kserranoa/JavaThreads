/*
Los generadores de energía debe ser capaz de producir 100 W por vuelta que completa
La cantidad de generadores es n y cada uno debe ser implementado con un hilo
Debe enviar esta energía a la batería. En el momento que la batería está llena los generadores deben detenerse
Cuando hay falta de energía en la batería deben continuar produciendo energía. 
*/
package threads;

public class Generador implements Runnable{    
    Thread t;
    double wattPORgenerador = 100;
    double cantGen; 
    double capacidadMAXbateria = 10001;
    double capacidadBateria = 0;
    String nombreGenerador;
    /*    
    Velocidades rápidas producen 100 W en 30 segundos
    Velocidades intermedias produzcan 100 W en 40 segundos    
    Velocdiad normal produzcan 100 W en 60 segundos
    Velocidad se producen 100 W en 90 segundos    
    CADA 2 MINUTOS DEBE CAMBIAR EL CLIMA (VELOCIDAD)
    */
    
    //Constructor 
    public Generador(){
        t = new Thread(this, "Generador #");
        t.start();
    }
    
        //Constructor nombre del generador 
    public Generador(String nombreGenerador){
        this.nombreGenerador = nombreGenerador;
        t = new Thread(this, "Generador #");        
    }
    
    //Metodo para generar carga 
    public void run(){
        try{
            while (capacidadBateria < capacidadMAXbateria) {
                System.out.println(nombreGenerador);                
                capacidadBateria++;                
                System.out.println(capacidadBateria);
                Thread.sleep(100);
            }
            
        }catch(Exception e){};
        
    }
}
