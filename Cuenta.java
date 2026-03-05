public class Cuenta {

    private double saldo;

    // Constructor sin parámetros: inicia con saldo en 0
    public Cuenta() {
        this.saldo = 0.0;
    }

    // Constructor con saldo inicial
    public Cuenta(double saldoInicial) {
        if (saldoInicial < 0) {
            this.saldo = 0.0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    // Añade dinero a la cuenta si el monto es válido
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso.");
        } else {
            System.out.println("Monto inválido.");
        }
    }

    // Extrae dinero si hay fondos suficientes
    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo -= monto;
                System.out.println("Retiro exitoso.");
            } else {
                System.out.println("Fondos insuficientes.");
            }
        } else {
            System.out.println("Monto inválido.");
        }
    }

    // Retorna el saldo actual de la cuenta
    public double getSaldo() {
        return saldo;
    }
}