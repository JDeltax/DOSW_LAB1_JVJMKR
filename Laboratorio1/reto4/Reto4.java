import java.util.Hashtable;
import java.util.Scanner;
import java.util.stream.Collectors;

public class reto4 {

    public static void main(String[] args) {
        Scanner sscan = new Scanner(System.in);
        String entrada = sscan.nextLine();
        Hashtable<String, Integer> tabla = leerComoHashtable(entrada);
        imprimirOrdenado(tabla);
    }

    public static Hashtable<String, Integer> leerComoHashtable(String entrada) {
        Hashtable<String, Integer> tabla = new Hashtable<>();

        entrada = entrada.replace("[", "")
                         .replace("]", "")
                         .replace("(", "")
                         .replace(")", "")
                         .replace("\"", "");

        String[] datos = entrada.split(",");

        for (int i = 0; i < datos.length - 1; i += 2) {
            String clave = datos[i].trim();
            int valor = Integer.parseInt(datos[i + 1].trim());

            if (!tabla.containsKey(clave)) {
                tabla.put(clave, valor);
            }
        }

        return tabla;
    }

    public static void imprimirOrdenado(Hashtable<String, Integer> tabla) {
        tabla.entrySet()
             .stream()
             .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
             .forEach(e ->
                 System.out.println(
                     "Clave: " + e.getKey() + " | Valor: " + e.getValue()
                 )
             );
    }
}
