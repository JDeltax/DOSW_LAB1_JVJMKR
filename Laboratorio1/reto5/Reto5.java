import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Reto5{

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        TreeSet<Integer> theTreeSet = Arrays.stream(entrada.replace("[", "").replace("]", "").split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println();
        System.out.println(theTreeSet);
        scanner.close();
        


    }



}
