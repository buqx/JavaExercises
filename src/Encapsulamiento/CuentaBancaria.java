public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public double retirar(double monto) {
        if(monto > saldo){
            System.out.println("Fondos insuficientes");
            return saldo;
        }
        else {
            saldo -= monto;
            return saldo;
        }
    }

    public double depositar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser positivo");
            return saldo;
        } else {
            saldo += monto;
            return saldo;
        }
    }

    public CuentaBancaria(String numeroCuenta, double saldo) {}
}
