import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class CarreraParalela {

    public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        int elnum = maxnum(numbers);
        List<Integer> array = convertToList(numbers);
        int small = smallNumber(array);
        int lenNumbers = array.size();
        System.out.println(elnum);
        System.out.println(small);
        System.out.println(lenNumbers);

        Resultado finalRes = finalResult(numbers);
        System.out.println(finalRes.toString());

    }



    public List<Integer> convertToList(String numbers) {

        return Arrays.stream(numbers.split(" "))

                     .map(Integer::parseInt)

                     .toList();

    }

    public int smallNumber(List<Integer> array) {

        return array.stream()

                      .min(Integer::compare)

                      .get();

    }

    public static int elUnum;



    public static int maxnum(String numeros){

        List<Integer> lista = Arrays.stream(numeros.split(" "))

                                    .map( x -> Integer.parseInt(x))

                                    .collect(Collectors.toList());



        int max = lista.stream().max(Integer::compareTo).orElse(0);



        return max;

    }


    public static Resultado finalResult(String numeros){

        List<Integer> lista = Arrays.stream(numeros.split(" "))
                                    .map(x -> Integer.parseInt(x))
                                    .collect(Collectors.toList());
        int max = lista.stream().max(Integer::compareTo).orElse(0);

        int min =lista.stream().min(Integer::compareTo).get();

        Resultado resultix = new Resultado(max, min, lista.size());
        return resultix;



    }

}

class Resultado {
    int max;
    int min;
    int cantidad;

    public Resultado(int max, int min, int cantidad) {
        this.max = max;
        this.min = min;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "FINAL -> Máximo: " + max + ", Mínimo: " + min + ", Total datos: " + cantidad;
    }
}
