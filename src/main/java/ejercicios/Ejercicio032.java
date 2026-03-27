package ejercicios;

import java.util.Scanner;

public class Ejercicio032 {
	
	//COMPLETAR METODO
	public void contarParesArray() {
	    Scanner scanner = new Scanner(System.in);
	    int[] numeros = new int[5];
	    
	    for (int i = 0; i < 5; i++) {
	        numeros[i] = scanner.nextInt();
	    }
	    
	    int pares = 0;
	    for (int n : numeros) {
	        if (n % 2 == 0) pares++;
	    }
	    
	    System.out.println("Hay " + pares + " números pares.");
	    scanner.close();
    }
    
    public static void main(String[] args) {
        Ejercicio032 ejercicio = new Ejercicio032();
        ejercicio.contarParesArray();
    }
    
}
