/**
 * Muestra en la pantalla "¡Hola mundo!"
 */
public class HelloWorld{
    public static void main (String[] args){
        String rojo = "\033[32m";
        String azul = "\033[34m";
        System.out.println(rojo + "¡Hola mundo!");
        System.out.println(azul + "Aquí estamos haciendo pruebas en Git.");
    }
}