/*
Segun las paginas https://www.translatorscafe.com/unit-converter/es-ES/power/5-1/gigawatt-watt/?value=10 y 
https://www.rapidtables.com/convert/power/gw-to-watt.html
10 giga watt equivale a 10 000 000 000 watt
*/

package threads;

public class Main {

    public static void main(String[] args) {
        Generador generador1 = new Generador("Generador 1");
        Generador generador2 = new Generador("Generador 2");
        Generador generador3 = new Generador("Generador 3");
        generador1.run();
        generador2.run();
        generador3.run();
        
    }

}
