import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarreraParalela {
  
    public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first line of numbers:");
        Result numbers1 = finalResult(scanner.nextLine());

        System.out.println("Enter second line of numbers:");
        Result numbers2 = finalResult(scanner.nextLine());

        System.out.println("First line results: " + numbers1.toString());
        System.out.println("Second line results: " + numbers2.toString());


    }


    public static Result finalResult(String numbers){
        List<Integer> listNumbers = Arrays.stream(numbers.split(" "))
                                    .map(x -> Integer.parseInt(x))
                                    .collect(Collectors.toList());
        int max = listNumbers.stream().max(Integer::compareTo).orElse(0);
        int min = listNumbers.stream().min(Integer::compareTo).get();
        
        Result resultix = new Result(max, min, listNumbers.size());

        return resultix;
    }

}

class Result {
    int max;
    int min;
    int cantidad;

    public Result(int max, int min, int cantidad) {
        this.max = max;
        this.min = min;
        this.cantidad = cantidad;
    }

    String maxIsMultipleOf2 = (max%2==0) ? "yes" : "No";
    String maxIsDivisorOf2 = (max != 0 && 2 % max == 0) ? "Yes" : "No";

    String isPair = (cantidad % 2 == 0) ? "yes" : "No";
    String isOdd = (cantidad % 2 != 0) ? "yes" : "No";
    @Override
    public String toString() {
        return "Max: " + max + ", Min: " + min + ", total data: " + cantidad + " Is divisor of 2: " +
        maxIsDivisorOf2 + " Is multiple of 2: " + maxIsMultipleOf2 + " is odd: " + isOdd + " is pair: " + isPair;

    }
}
