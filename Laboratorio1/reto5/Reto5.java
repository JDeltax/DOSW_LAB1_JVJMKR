import java.util.*;
import java.util.stream.Collectors;

public class Reto5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Set<Integer> numbers = readHashSet(input);
        Set<Integer> filtered = removeMultiplesOfThree(numbers);
        printNumbers(filtered);
    }

    public static Set<Integer> readHashSet(String input) {
        input = input.replace("[", "")
                     .replace("]", "");
        return Arrays.stream(input.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static Set<Integer> removeMultiplesOfThree(Set<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet());
    }

    public static void printNumbers(Set<Integer> numbers) {
        numbers.stream()
                .sorted()
                .forEach(n ->
                System.out.println("Number in arena: " + n)
        );
    }
}
