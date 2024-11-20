

public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 18; 
        this.curso = "Sin curso";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Sin curso"; 
    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); 
        this.curso = curso; 
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }
}
