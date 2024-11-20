import java.util.Scanner;

public class ProyectoIntegrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Crear un Libro ===");
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        int numeroPaginas = scanner.nextInt();
        Libro libro = new Libro(titulo, autor, numeroPaginas);
        libro.mostrarDetalles();

        System.out.println("\n=== Crear una Cuenta Bancaria ===");
        scanner.nextLine(); 
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldoInicial, tipoCuenta);
        cuenta.mostrarDetalles();

        System.out.println("\n=== Crear un Estudiante ===");
        scanner.nextLine(); 
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Ingrese el curso del estudiante: ");
        String cursoEstudiante = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante, cursoEstudiante);
        estudiante.mostrarDetalles();

        scanner.close();
    }
}