package Tareas; 

import java.util.Scanner; 

// Programa que cuenta la cantidad de votos de un candidato y calcula el porcentaje de votos obtenido de cada uno
class PorcentajeVotos { 

    public static void main(String[] args) {
        
        // Defino la cantidad máxima de candidatos (100)
        int[] votos = new int[101]; 
        int totalVotos = 0;

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Ingrese los votos (use 0 para finalizar):");

        // Contador para guardar qué candidato se está registrando
        while (true) {
            int voto = scanner.nextInt();
            if (voto == 0) {
                break;
            }

            if (voto >= 1 && voto <= 100) {
                votos[voto]++; 
                totalVotos++;
            } else {
                // Excepción en caso de que se agregue un número fuera del rango de 1 - 100
                System.out.println("Voto inválido. Ingrese un número entre 1 y 100.");
            }
        }

        scanner.close(); 
       
        // Manejo de la excepción por si no se registraron votos
        if (totalVotos == 0) {
            System.out.println("No se registraron votos.");
            return;
        }

        // Imprimo los resultados generales de votos y su porcentaje correspondiente
        System.out.println("Resultados:");
        for (int i = 1; i <= 100; i++) {
            if (votos[i] > 0) {
                // Declaro porcentaje y hago una regla de 3 para calcularlo
                double porcentaje = (votos[i] * 100.0) / totalVotos;
                System.out.printf("Candidato %d: %d votos (%.2f%%)%n", i, votos[i], porcentaje);
            }
        }
    }
}
