

	import java.util.Scanner;

	public class OperacionesConArreglos {
	    public static void main(String[] args) {
	       
	        Scanner sc = new Scanner(System.in);

	        int[] A = new int[5];
	        int[] B = new int[5];

	       
	        char opcion;
	        boolean salir = false;


	        while (!salir) {
	         
	           System.out.println("Menú:");
	         System.out.println("A. digite arreglo A");
	           System.out.println("B. digite arreglo B");
	         System.out.println("C. digite A + B");
	            System.out.println("D. ver  A - B");
	         System.out.println("E. ver A * B");
	          System.out.println("F. Salir 0 fin ");
	           System.out.print("Ingrese una opción: ");
	            opcion = sc.next().charAt(0);

	           
	            switch(opcion) {
	                case 'A':
	                case 'a':
	                    ingresarArreglo(A, sc);
	                    break;
	                case 'B':
	                case 'b':
	                    ingresarArreglo(B, sc);
	                    break;
	                case 'C':
	                case 'c':
	                    mostrarResultado(A, B, '+');
	                    break;
	                case 'D':
	                case 'd':
	                    mostrarResultado(A, B, '-');
	                    break;
	                case 'E':
	                case 'e':
	                    mostrarResultado(A, B, '*');
	                    break;
	                case 'F':
	                case 'f':
	                    salir = true;
	                    System.out.println("Adiós!");
	                    break;
	                default:
	                    System.out.println("Opción inválida");
	            }
	        }
	    }

	    
	    public static void ingresarArreglo(int[] arreglo, Scanner sc) {
	        System.out.println("Ingrese los valores del arreglo:");
	        for (int i = 0; i < arreglo.length; i++) {
	            System.out.print("Valor " + (i+1) + ": ");
	            arreglo[i] = sc.nextInt();
	        }
	    }

	
	    public static void mostrarResultado(int[] A, int[] B, char operacion) {
	        int[] resultado = new int[5];
	        switch (operacion) {
	            case '+':
	                for (int i = 0; i < A.length; i++) {
	                    resultado[i] = A[i] + B[i];
	                }
	                System.out.println("Resultado de A + B: " + arrayToString(resultado));
	                break;
	            case '-':
	                for (int i = 0; i < A.length; i++) {
	                    resultado[i] = A[i] - B[i];
	                }
	                System.out.println("Resultado de A - B: " + arrayToString(resultado));
	                break;
	            case '*':
	                for (int i = 0; i < A.length; i++) {
	                    resultado[i] = A[i] * B[i];
	                }
	                System.out.println("Resultado de A * B: " + arrayToString(resultado));
	                break;
	            default:
	                System.out.println("resultado invalido");
	        }
	   

}

		private static String arrayToString(int[] resultado) {
			
			return null;
		}
	}
