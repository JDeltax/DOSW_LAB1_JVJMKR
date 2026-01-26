import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class R3 {

    public static void main(String[] args) {

        String mensaje = "hola";
        System.out.println(Elbuilder(mensaje));
        System.out.println(invertirMensaje(mensaje));


    }
    public static String Elbuilder(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str + " ");
        sb.append(str + " ");
        sb.append(str);

        return sb.toString();
    }

    public static String invertirMensaje(String mensaje) {
        Function<String, String> invertir = s -> {
            List<Character> chars = s.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toList());

            Collections.reverse(chars);

            return chars.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining());
        };

        return invertir.apply(mensaje);
    }


}