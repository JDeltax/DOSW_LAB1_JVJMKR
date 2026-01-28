import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String hashMapInput = scanner.nextLine();
        HashMap<String, Integer> hashMap = readAsHashMap(hashMapInput);

        String hashtableInput = scanner.nextLine();
        Hashtable<String, Integer> hashtable = readAsHashtable(hashtableInput);
        Map<String, Integer> mergedMap = mergeMaps(hashMap, hashtable);

        printOrdered(mergedMap);
    }

    public static HashMap<String, Integer> readAsHashMap(String input) {
        HashMap<String, Integer> map = new HashMap<>();
        processInput(input, map);
        return map;
    }

    public static Hashtable<String, Integer> readAsHashtable(String input) {
        Hashtable<String, Integer> table = new Hashtable<>();
        processInput(input, table);
        return table;
    }

    private static void processInput(String input, Map<String, Integer> map) {

        input = input.replace("[", "")
                     .replace("]", "")
                     .replace("(", "")
                     .replace(")", "")
                     .replace("\"", "");

        String[] data = input.split(",");

        for (int i = 0; i < data.length - 1; i += 2) {
            String key = data[i].trim();
            int value = Integer.parseInt(data[i + 1].trim());

            map.putIfAbsent(key, value);
    }

    public static Map<String, Integer> mergeMaps(
            HashMap<String, Integer> hashMap,
            Hashtable<String, Integer> hashtable) {

        Map<String, Integer> result = new HashMap<>(hashMap);

        hashtable.forEach(result::put);

        return result;
    }

    public static void printOrdered(Map<String, Integer> map) {
        map.entrySet()
           .stream()
           .sorted(Map.Entry.comparingByKey())

           .forEach(entry ->
               System.out.println("Clave: " + entry.getKey().toUpperCase() + " | Valor: " + entry.getValue())
           );

    }
}

