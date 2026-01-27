import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarreraParalela {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first line of numbers:");
        Result numbers1 = finalResult(scanner.nextLine());

        System.out.println("Enter second line of numbers:");
        Result numbers2 = finalResult(scanner.nextLine());

        System.out.println("First line results: " + numbers1);
        System.out.println("Second line results: " + numbers2);
    }

    public static Result finalResult(String numbers) {
        List<Integer> listNumbers = Arrays.stream(numbers.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int max = listNumbers.stream().max(Integer::compareTo).orElse(0);
        int min = listNumbers.stream().min(Integer::compareTo).orElse(0);

        return new Result(max, min, listNumbers.size());
    }
}

class Result {
    int max;
    int min;
    int cantidad;

    String maxIsMultipleOf2;
    String maxIsDivisorOf2;
    String isPair;
    String isOdd;

    public Result(int max, int min, int cantidad) {
        this.max = max;
        this.min = min;
        this.cantidad = cantidad;

        this.maxIsMultipleOf2 = (max % 2 == 0) ? "Yes" : "No";
        this.maxIsDivisorOf2 = (max != 0 && 2 % max == 0) ? "Yes" : "No";
        this.isPair = (cantidad % 2 == 0) ? "Yes" : "No";
        this.isOdd = (cantidad % 2 != 0) ? "Yes" : "No";
    }

    @Override
    public String toString() {
        return "Max: " + max +
               ", Min: " + min +
               ", Total data: " + cantidad +
               ", Max is divisor of 2: " + maxIsDivisorOf2 +
               ", Max is multiple of 2: " + maxIsMultipleOf2 +
               ", Is odd: " + isOdd;
    }
}

