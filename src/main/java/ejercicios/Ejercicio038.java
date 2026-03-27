package ejercicios;
import java.util.Scanner;
public class Ejercicio038 {
	// COMPLETAR METODO: Genera numero aleatorio 1-50
    public int generarNumeroSecreto() {
    	return (int) (Math.random() * 50) + 1;
    }
    
    // COMPLETAR METODO: Compara intento con secreto y dice resultado
    public String comprobarIntento(int intento, int numeroSecreto) {
        if (intento < numeroSecreto) {
            return "¡Más alto!";
        } else if (intento > numeroSecreto) {
            return "¡Más bajo!";
        } else {
            return "¡CORRECTO! El número era: " + numeroSecreto;
        }
    }

    // COMPLETAR METODO: Funcion principal que usa ambos modulos
    public void adivinarNumero() {
        Scanner scanner = new Scanner(System.in);
        int secreto = generarNumeroSecreto();
        int intento;
        
        System.out.println("Adivina el número (1-50):");
        do {
            intento = scanner.nextInt();
            System.out.println(comprobarIntento(intento, secreto));
        } while (intento != secreto);
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        Ejercicio038 ejercicio = new Ejercicio038();
        ejercicio.adivinarNumero();
    }
}
