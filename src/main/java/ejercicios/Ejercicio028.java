package ejercicios;

import java.util.Scanner;

public class Ejercicio028 {
	
	private double saldo = 1000.0;  // Saldo inicial
	
	//COMPLETAR METODO
    public void cajeroAutomatico() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Saldo actual: " + (int) saldo);
        int opcion;
        do {
            System.out.println("=== CAJERO AUTOMÁTICO ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: consultarSaldo(); break;
                case 2: ingresarDinero(scanner); break;
                case 3: retirarDinero(scanner); break;
                case 0: System.out.println("¡Hasta luego!"); break;
                default: System.out.println("Opción no válida"); break;
            }
        } while (opcion != 0);

        scanner.close();
    }
    
    //COMPLETAR METODO
    private void consultarSaldo() {
        if (saldo == (int) saldo) {
            System.out.println("Saldo actual: " + (int) saldo);
        } else {
            System.out.println("Saldo actual: " + saldo);
        }
    }
    
    //COMPLETAR METODO
    private void ingresarDinero(Scanner scanner) {
        System.out.print("Cantidad a ingresar: ");
        double cantidad = scanner.nextDouble();
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva");
        } else {
            saldo += cantidad;
            System.out.println("Ingreso realizado. Nuevo saldo: " + (int) saldo);
        }
    }
    
    //COMPLETAR METODO
    private void retirarDinero(Scanner scanner) {
        System.out.print("Cantidad a retirar: ");
        double cantidad = scanner.nextDouble();
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva");
        } else if (cantidad > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + (int) saldo);
        }
    }

    public static void main(String[] args) {
        Ejercicio028 ejercicio = new Ejercicio028();
        ejercicio.cajeroAutomatico();
    }
    
}
