
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Reto1 {

    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante("Juan Vega", 20, 6, "juan.vega-v@mail.escuelaing.edu.co");
        Estudiante estudiante2 = new Estudiante("Juan Moreno", 20, 6, "juan.mdaleman@mail.esucleaing.edu.co");
        Estudiante estudiante3 = new Estudiante("Karol Rodriguez", 20, 6, "karol.rodriguez-r@mail.escuelaing.edu.co");
        
        List<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);

        String mensaje = "¡Hola, bienvenidos! Nosotros somos el trio conformado por \r\n" +
            estudiantes.stream()
                .map(s -> String.format(
                    "%s, estudiante de la escuela, %d semestre, %d años, %s, \r\n",
                    s.getNombre(),
                    s.getSemestre(),
                    s.getEdad(),
                    s.getCorreo()
                ))
                .collect(Collectors.joining()) +

                " Nuestros correos\r\n" +
            estudiantes.stream()
                .map(Estudiante::getCorreo)
                .collect(Collectors.joining(" y \r\n")) +

                ".\r\n";


        System.out.println(mensaje);
    }
}
