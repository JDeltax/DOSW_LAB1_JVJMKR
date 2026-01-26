import java.util.stream.Collectors;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class R3 {

    public static void main(String[] args) {

        String menssage = "me perdi en la cueva";

        Function<String, String> reverse = s -> {
                    List<Character> chars = s.chars()
                            .mapToObj(c -> (char) c)
                            .collect(Collectors.toList());
                    Collections.reverse(chars);

                    return chars.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining());
                };

        String result = reverse.apply(menssage);

        System.out.println(result);
    }
}
