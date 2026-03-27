package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio026 {
	
	//COMPLETAR METODO
	public void gestorUsuarios() {
	    Scanner scanner = new Scanner(System.in);
	    List<String> nombres = new ArrayList<>();
	    String nombre;

	    System.out.print("Introduce un nombre (o 'fin' para terminar): ");
	    nombre = scanner.nextLine();

	    while (!nombre.equals("fin")) {
	        nombres.add(nombre);
	        System.out.print("Introduce un nombre (o 'fin' para terminar): ");
	        nombre = scanner.nextLine();
	    }

	    if (nombres.isEmpty()) {
	        System.out.println("No se introdujeron nombres.");
	    } else {
	        String mayor = nombres.get(0);
	        String menor = nombres.get(0);

	        for (String n : nombres) {
	            if (n.length() > mayor.length()) mayor = n;
	            if (n.length() < menor.length()) menor = n;
	        }

	        System.out.println("Cantidad de nombres: " + nombres.size());
	        System.out.println("Nombre más largo: " + mayor);
	        System.out.println("Nombre más corto: " + menor);
	    }

	    scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio026 ejercicio = new Ejercicio026();
        ejercicio.gestorUsuarios();
    }
}
