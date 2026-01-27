    
public class Estudiante{
    private String nombre;
    private int edad;
    private int semestre;
    private String correo;

    public Estudiante(String nombre, int edad, int semestre, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.semestre = semestre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getSemestre() {
        return semestre;
    }
    public String getCorreo() {
        return correo;
    }
}