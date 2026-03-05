import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta;
        // Preguntar al usuario si desea iniciar su cuenta con saldo en 0 o con un saldo inicial
        System.out.print("¿Desea empezar su saldo en 0? (s/n): ");
        String respuesta = sc.nextLine();
        // Si el usuario responde "n", se le solicita ingresar un saldo inicial
        if (respuesta.equalsIgnoreCase("n")) {

            System.out.print("Ingrese el saldo inicial: ");
            double saldoInicial = sc.nextDouble();
            sc.nextLine();

            cuenta = new Cuenta(saldoInicial);
        // Si el usuario responde "s" o cualquier otra cosa, se inicia la cuenta con saldo en 0
        } else {

            cuenta = new Cuenta(); // usa el otro constructor

        }

        boolean continuar = true;

        // Menú principal que permite al usuario gestionar su cuenta
        while (continuar) {

            System.out.println("\n--- Menú de Cuenta ---");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Saldo");
            System.out.println("4. Salir");
            System.out.print("Selección: ");
            // Lee la opción del usuario
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                // Opción de depósito
                case 1: 
                    System.out.print("Monto a depositar: ");
                    double deposito = sc.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                // Opción de retiro
                case 2: 
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                // Mostrar saldo actual
                case 3: 
                    System.out.printf("Saldo actual: $%.2f%n", cuenta.getSaldo());
                    break;
                // Cerrar programa
                case 4: 
                    System.out.println("¡Gracias por usar el sistema!");
                    continuar = false;
                    break;
                // Opción no válida
                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}