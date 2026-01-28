import java.util.*;

public class Reto4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String command = extractCommand(input);

        Map<String, Runnable> commandMap = createCommandMap();
        executeWithMap(command, commandMap);
        demoAllCommands(commandMap);
    }
    
    public static String extractCommand(String input) {
        return input.substring(
            input.indexOf("\"") + 1,
            input.lastIndexOf("\"")
        );
    }

    public static void executeWithSwitch(String command) {
        switch (command.toUpperCase()) {
            case "BROMEAR":
                System.out.println("La máquina se ríe: ¿por qué la RAM rompió con la CPU? Porque necesitaba espacio");
                break;
            case "GRITAR":
                System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!");
                break;
            case "SUSURRAR":
                System.out.println("La máquina susurra: Shhh... los bugs están dormidos");
                break;
            case "ANALIZAR":
                System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando!");
                break;
            default:
                System.out.println("Comando no reconocido");
        }
    }

    public static Map<String, Runnable> createCommandMap() {

        Map<String, Runnable> commands = new HashMap<>();

        commands.put("BROMEAR",  () -> executeWithSwitch("BROMEAR"));
        commands.put("GRITAR",   () -> executeWithSwitch("GRITAR"));
        commands.put("SUSURRAR", () -> executeWithSwitch("SUSURRAR"));
        commands.put("ANALIZAR", () -> executeWithSwitch("ANALIZAR"));

        return commands;
    }

    public static void executeWithMap(
            String command,
            Map<String, Runnable> commands) {

        Runnable action = commands.get(command.toUpperCase());

        if (action != null) {
            action.run(); 
        } else {
            System.out.println("Comando no reconocido");
        }
    }

    public static void demoAllCommands(Map<String, Runnable> commands) {
        commands.forEach((cmd, action) -> {
            System.out.print(cmd + " -> ");
            action.run();
        });
    }
}
