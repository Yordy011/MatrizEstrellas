
package matrizestrellas;

import java.util.Scanner;

public class MatrizEstrellas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preguntar al usuario el número de niveles
        System.out.print("Ingrese el número de niveles: ");
        int niveles = scanner.nextInt();

        // Preguntar al usuario el carácter a utilizar
        System.out.print("Ingrese el carácter a utilizar: ");
        char caracter = scanner.next().charAt(0);

        // Crear objetos de las clases MatrizA y MatrizB
        MatrizA matrizA = new MatrizA();
        MatrizB matrizB = new MatrizB();

        // Imprimir matriz a)
        System.out.println("Matriz a):");
        matrizA.imprimirMatrizA(niveles, caracter);

        // Imprimir matriz b)
        System.out.println("\nMatriz b):");
        matrizB.imprimirMatrizB(niveles, caracter);

        scanner.close();
    }
}
