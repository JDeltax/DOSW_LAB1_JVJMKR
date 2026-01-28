import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reto6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String command = extractCommand(input);

        executeCommand(command);
    }

    public static void executeCommand(String command) {
        Map<String, Runnable> actions = createActions();
        switch (command) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                actions.get(command).run();
                break;
            default:
                System.out.println("Comando no reconocido.");
        }
    }

    private static String extractCommand(String input) {
        int start = input.indexOf("\"");
        int end = input.lastIndexOf("\"");
        if (start == -1 || end == -1 || start == end) {
            return "";
        }
        return input.substring(start + 1, end);
    }

    private static Map<String, Runnable> createActions() {
        Map<String, Runnable> actions = new HashMap<>();
        actions.put("SALUDAR", () ->
                System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!")
        );
        actions.put("DESPEDIR", () ->
                System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión.")
        );
        actions.put("CANTAR", () ->
                System.out.println("La máquina canta: 01010101")
        );
        actions.put("DANZAR", () ->
                System.out.println("La máquina gira y emite chispas: Girando en modo fiesta.")
        );
        actions.put("BROMEAR", () ->
                System.out.println("La máquina se ríe: ¿por qué la RAM rompió con la CPU? Porque necesitaba espacio")
        );
        actions.put("GRITAR", () ->
                System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!")
        );
        actions.put("SUSURRAR", () ->
                System.out.println("La máquina susurra: Shhh... los bugs están dormidos")
        );
        actions.put("ANALIZAR", () ->
                System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando!")
        );
        return actions;
    }
}