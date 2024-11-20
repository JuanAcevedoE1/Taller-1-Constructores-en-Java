import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.mostrarDetalles(); 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();

        CuentaBancaria cuenta2 = new CuentaBancaria(numeroCuenta, tipoCuenta);
        cuenta2.mostrarDetalles(); 

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        CuentaBancaria cuenta3 = new CuentaBancaria(numeroCuenta, saldoInicial, tipoCuenta);
        cuenta3.mostrarDetalles(); 

        
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarDetalles(); 

        scanner.nextLine();
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante = scanner.nextInt();

        Estudiante estudiante2 = new Estudiante(nombreEstudiante, edadEstudiante);
        estudiante2.mostrarDetalles();

        scanner.nextLine();
        System.out.print("Ingrese el curso del estudiante: ");
        String cursoEstudiante = scanner.nextLine();

        Estudiante estudiante3 = new Estudiante(nombreEstudiante, edadEstudiante, cursoEstudiante);
        estudiante3.mostrarDetalles(); 

        scanner.close();
    }
}