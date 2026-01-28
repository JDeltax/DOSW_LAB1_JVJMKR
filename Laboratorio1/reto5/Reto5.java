import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Reto5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Integer> hashh = readHashSet(scanner.nextLine());
        Set<Integer> trees = readTreeSet(scanner.nextLine());

        trees.addAll(hashh);
        printNumbers(trees);
    }

    public static Set<Integer> readTreeSet(String input) {

        TreeSet<Integer> theTreeSet = Arrays.stream(
                    input.replace("[", "")
                         .replace("]", "")
                         .split(",")
                )
                .map(String::trim)
                .map(Integer::parseInt)
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));

        return theTreeSet;
    }

    public static Set<Integer> readHashSet(String input) {

        input = input.replace("[", "")
                     .replace("]", "");

        return Arrays.stream(input.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static void printNumbers(Set<Integer> numbers) {

        numbers.stream()
                .sorted()
                .forEach(n -> 
                    System.out.println("Number in arena: " + n)
                );
    }
}
