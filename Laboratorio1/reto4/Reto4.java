import java.util.*;
import java.util.stream.*;

public class Reto4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = readMap(scanner);

        printMap(map);
    }

    public static Map<String, Integer> readMap(Scanner scanner) {

        String input = scanner.nextLine(); //String Integer 

        String[] tokens = input.split("\\s+");

        return IntStream.range(0, tokens.length - 1)
                .filter(i -> i % 2 == 0)
                .boxed()
                .collect(Collectors.toMap(
                    i -> tokens[i],
                    i -> Integer.parseInt(tokens[i + 1]),
                    (first, duplicate) -> first,
                    HashMap::new
                ));
    }

    public static void printMap(Map<String, Integer> map) {
        map.forEach((k, v) -> System.out.println("Clave: " + k + " | " + v));
    }
}
