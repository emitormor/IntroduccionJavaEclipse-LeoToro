package ejercicios;

public class Ejercicio010 {
	
	//COMPLETAR METODO
	public void mostrarFor() {
        System.out.print("FOR: ");
        for (int i = 1; i <= 100; i++) {
        	System.out.print(i + " ");
        }
        System.out.println();
    }
	
	//COMPLETAR METODO
    public void mostrarWhile() {
        System.out.print("WHILE: ");
        int i = 1;
        while (i <= 100) {
        	System.out.print(i + " ");
        	i++;
        }
        System.out.println();
    }
    
  //COMPLETAR METODO
    public void mostrarDoWhile() {
        System.out.print("DO-WHILE: ");
        int i = 1;
        do {
        	System.out.print(i + " ");
        	i++;
        } while (i <= 100);
        System.out.println();
    }

    public static void main(String[] args) {
    	Ejercicio010 ejercicio010 = new Ejercicio010();
    	ejercicio010.mostrarFor();
    	ejercicio010.mostrarWhile();
    	ejercicio010.mostrarDoWhile();
    }
}
