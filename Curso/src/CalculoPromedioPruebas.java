

	import java.util.Scanner;

	public class CalculoPromedioPruebas {
	    public static void main(String[] args) {
	       
	        Scanner sc = new Scanner(System.in);
            String nombre = "NICOLAS  ARTEAGA ";
            System.out.print("EL CALIFICADOR ES "+ nombre + "\n");
	
	        int[] resultados = new int[5];

	        // Pedir al usuario que ingrese los resultados de las 5 pruebas
	        for (int i = 0; i < 5; i++) {
	        	
	            System.out.print("Ingrese el resultado de la prueba " + (i+1) + ": ");
	            resultados[i] = sc.nextInt();
	        }

	        // Calcular el promedio de los resultados que tiene = 0
	        double promedio = 0;
	        for (int i = 0; i < 5; i++) {
	            promedio += resultados[i];
	        }
	        promedio /= 5;

	      
	        System.out.println("El promedio de las pruebas es: " + promedio);
	    }
	}


