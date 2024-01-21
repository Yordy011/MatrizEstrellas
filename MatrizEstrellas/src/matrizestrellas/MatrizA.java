
package matrizestrellas;

public class MatrizA {

    // Método para imprimir la matriz a)
    public void imprimirMatrizA(int niveles, char caracter) {
        long startTime = System.nanoTime(); // Iniciar el cronómetro

        for (int i = 1; i <= niveles; i++) {
            for (int j = 1; j <= i; j++) {
                // La operación interna es constante (imprimir un carácter)
                System.out.print(caracter + " ");
            }
            System.out.println();
        }

        long endTime = System.nanoTime(); // Detener el cronómetro
        double elapsedTimeInSeconds = (endTime - startTime) / 1e9; // Convertir a segundos

        // Imprimir tiempos
        System.out.println("Tiempo Mejor Esperado: O(1)");
        System.out.println("Tiempo Peor Esperado: O(" + niveles + "^2)");
        System.out.println("Tiempo Esperado: O(" + niveles + "^2)");
        System.out.println("Tiempo de ejecución: " + elapsedTimeInSeconds + " segundos");
    }
}
