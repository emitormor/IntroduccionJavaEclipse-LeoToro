package ejercicios;

import java.util.Scanner;

public class Ejercicio037 {
	
	//COMPLETAR METODO
	public void contarRepeticiones() {
	    Scanner scanner = new Scanner(System.in);
	    int[] numeros = new int[5];
	    
	    for (int i = 0; i < 5; i++) {
	        numeros[i] = scanner.nextInt();
	    }
	    
	    boolean[] contado = new boolean[5];
	    
	    for (int i = 0; i < numeros.length; i++) {
	        if (contado[i]) continue;
	        int repeticiones = 1;
	        for (int j = i + 1; j < numeros.length; j++) {
	            if (numeros[j] == numeros[i]) {
	                repeticiones++;
	                contado[j] = true;
	            }
	        }
	        System.out.println(numeros[i] + " se repite " + repeticiones + " vez/veces");
	    }
	    scanner.close();
    }
    
    public static void main(String[] args) {
        Ejercicio037 ejercicio = new Ejercicio037();
        ejercicio.contarRepeticiones();
    }
}
