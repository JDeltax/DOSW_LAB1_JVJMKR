import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class R3 {
    public static void main(String[] args) {

        String menssage = "hola";
        System.out.println(builder(menssage));
        System.out.println(reverseMenssage(menssage));


    }
    public static String builder(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str + " ");
        sb.append(str + " ");
        sb.append(str);

        return sb.toString();
    }

    public static String reverseMenssage(String menssage) {
        Function<String, String> invest = s -> {
            List<Character> chars = s.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toList());

            Collections.reverse(chars);

            return chars.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining());
        };

        return invest.apply(menssage);
    }
}
