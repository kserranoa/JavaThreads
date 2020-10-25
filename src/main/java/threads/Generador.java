/*
Los generadores de energía debe ser capaz de producir 100 W por vuelta que completa
La cantidad de generadores es n y cada uno debe ser implementado con un hilo
Debe enviar esta energía a la batería. En el momento que la batería está llena los generadores deben detenerse
Cuando hay falta de energía en la batería deben continuar produciendo energía. 
*/
package threads;


public class Generador {
    //Array rapidez[] = poca(90), normal(60), intemerdia(40), rapida(30);
    int watt = 100;
    int cantGen; 
    /*    
    Velocidades rápidas producen 100 W en 30 segundos
    Velocidades intermedias produzcan 100 W en 40 segundos    
    Velocdiad normal produzcan 100 W en 60 segundos
    Velocidad se producen 100 W en 90 segundos    
    */
    
    // if rapidez {establecerVel}
    // calcEnergia = rapidez * watt * cantGen; 
}
