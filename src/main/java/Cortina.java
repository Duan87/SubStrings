//java
import java.util.*;

/**
 *
 * @author duanr
 */

public class Cortina {

    public static void main(String[] args) {
        System.out.println(func("dbac", 2));
    }

    public static char func(String n, int t) {
        List cadenas = new LinkedList<>();//creamos una lista para almacenas todas las subcadenas posibles
        for (int i = 0; i < n.length(); i++) {
            for (int c = i + 1; c <= n.length(); c++) {
                cadenas.add(n.substring(i, c));//con el metodo substring y el for anidado nos aseguramos de obtener todos los valores de las subcadenas
            }
        }
        Collections.sort(cadenas);//ordenamos por orden alfabetico
        String palabra_final = "";

        for (var s : cadenas) {//concatenamos todos los valores detro de la lista cadenas en un string
            palabra_final += s;
        }
        char h = palabra_final.charAt(t - 1);//obtenemos el caracter deseado
        return h;
    }

}
