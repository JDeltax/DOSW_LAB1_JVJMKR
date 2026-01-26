import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarreraParalela {
    public static int elnum;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeros = scanner.nextLine();

        elnum = maxnum(numeros);
        System.out.println(elnum);
    }

    public static int maxnum(String numeros){
        List<Integer> lista = Arrays.stream(numeros.split(" ")) // 1. Divide el string
                                    .map( x -> Integer.parseInt(x))
                                    .collect(Collectors.toList());

        int max = lista.stream().max(Integer::compareTo).orElse(0);

        return max;
    }
}
