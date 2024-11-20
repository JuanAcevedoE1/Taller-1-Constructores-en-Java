

public class CuentaBancaria {
    
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public CuentaBancaria() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; // Inicializa saldo en 0
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public void mostrarDetalles() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}