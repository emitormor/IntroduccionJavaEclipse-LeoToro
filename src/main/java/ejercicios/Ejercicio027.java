package ejercicios;

import java.util.Scanner;

public class Ejercicio027 {
	
	//COMPLETAR METODO
	public void decimalABinario() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Introduce un número decimal: ");
	    int numero = scanner.nextInt();

	    if (numero == 0) {
	        System.out.println("Binario: 0");
	        scanner.close();
	        return;
	    }

	    String binario = "";
	    int n = numero;

	    while (n > 0) {
	        binario = (n % 2) + binario;
	        n = n / 2;
	    }

	    System.out.println("Binario: " + binario);
	    scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio027 ejercicio = new Ejercicio027();
        ejercicio.decimalABinario();
    }
}
