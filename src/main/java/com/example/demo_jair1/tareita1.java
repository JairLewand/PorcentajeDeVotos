// En Java, debemos importar explícitamente las librerías necesarias, en este caso Scanner para entrada de datos
// En C usaríamos `#include <stdio.h>` para entrada/salida y `#include <stdlib.h>` si quisiéramos manejar memoria dinámicamente
import java.util.Scanner; 

// En Java, todo el código debe estar dentro de una clase. En C, esto no es necesario.
class Votos {
    // En Java, la ejecución comienza en el método `main`, que siempre debe estar dentro de una clase.
    // En C, la ejecución empieza en la función `int main()`, sin necesidad de estar dentro de una clase.
    public static void main(String[] args) {
        
        // En C, un array de enteros se declara como `int votos[101];`
        // En Java, los arreglos se declaran con `new` porque son objetos.
        int[] votos = new int[101]; 
        
        // Variable para contar el total de votos ingresados.
        // En C, esto sería simplemente `int totalVotos = 0;`, igual que en Java.
        int totalVotos = 0;

        // En Java, para leer entrada desde el teclado, usamos Scanner, que es una clase.
        // En C, usamos `scanf()` para leer valores desde la consola.
        Scanner scanner = new Scanner(System.in); 

        // En C, imprimiríamos con `printf("Ingrese los votos (use 0 para finalizar):\n");`
        System.out.println("Ingrese los votos (use 0 para finalizar):");

        // En Java, `while(true)` se usa igual que en C para crear un bucle infinito.
        while (true) {
            // En C, leeríamos con `scanf("%d", &voto);`, aquí usamos `scanner.nextInt();`
            int voto = scanner.nextInt();
            
            // Condición para salir del bucle. En C se haría igual con `if (voto == 0) break;`
            if (voto == 0) {
                break;
            }

            // Validación del rango del voto (debe estar entre 1 y 100).
            // En C, la sintaxis del `if` es idéntica.
            if (voto >= 1 && voto <= 100) {
                votos[voto]++;  // Incrementamos el voto del candidato. En C se haría igual `votos[voto]++;`
                totalVotos++;   // Contamos el total de votos, igual que en C.
            } else {
                // En C, sería `printf("Voto inválido. Ingrese un número entre 1 y 100.\n");`
                System.out.println("Voto inválido. Ingrese un número entre 1 y 100.");
            }
        }

        // En C, no es necesario liberar `stdin`, pero en Java cerramos el Scanner para liberar recursos.
        scanner.close(); 
       
        // En C, esto se haría igual con `if (totalVotos == 0) { printf("No se registraron votos.\n"); return 0; }`
        if (totalVotos == 0) {
            System.out.println("No se registraron votos.");
            return;
        }

        // En C, esto sería `printf("Resultados:\n");`
        System.out.println("Resultados:");
        
        // En C, la sintaxis del `for` es igual. Sin embargo, los arreglos en Java son objetos, mientras que en C son bloques de memoria contiguos.
        for (int i = 1; i <= 100; i++) {
            // En C, la comparación sería igual `if (votos[i] > 0)`
            if (votos[i] > 0) {
                // En C, para calcular porcentaje sería `double porcentaje = (votos[i] * 100.0) / totalVotos;`
                double porcentaje = (votos[i] * 100.0) / totalVotos;
                
                // En C, usaríamos `printf("Candidato %d: %d votos (%.2f%%)\n", i, votos[i], porcentaje);`
                System.out.printf("Candidato %d: %d votos (%.2f%%)%n", i, votos[i], porcentaje);
            }
        }
    }
}


