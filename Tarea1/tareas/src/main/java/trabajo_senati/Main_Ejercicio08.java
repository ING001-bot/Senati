package trabajo_senati;

import java.util.Scanner;

public class Main_Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cantidadEstudiantes;
        int aprobados = 0, considerados = 0;
        int nota, sumaNotas;
        double promedio, sumaPromedios = 0;
        double porcentajeAprobados, mejorPromedio = -1;
        String nombre, mejorEstudiante = "";

        System.out.println("----- NOTAS DE UN AULA -----");
        System.out.print("Ingrese el número de estudiantes: ");
        cantidadEstudiantes = teclado.nextInt();

        for (int i = 1; i <= cantidadEstudiantes; i++) {
            System.out.print("Nombre del estudiante: ");
            nombre = teclado.next();

            sumaNotas = 0;
            boolean notasValidas = true;

            for (int j = 1; j <= 3; j++) {
                System.out.print("Ingrese la nota " + j + ": ");
                nota = teclado.nextInt();

                sumaNotas += nota;
                if (nota < 0 || nota > 20) {
                    notasValidas = false;
                }
            }

            if (!notasValidas) {
                System.out.println(nombre + ": nota inválida, no se considera");
            } else {
                promedio = (double) sumaNotas / 3;
                considerados++;
                sumaPromedios += promedio;

                if (promedio >= 11) {
                    aprobados++;
                    System.out.printf("%s: promedio %.2f - Aprobado%n", nombre, promedio);
                } else {
                    System.out.printf("%s: promedio %.2f - Desaprobado%n", nombre, promedio);
                }

                if (promedio > mejorPromedio) {
                    mejorPromedio = promedio;
                    mejorEstudiante = nombre;
                }
            }
        }

        if (considerados == 0) {
            System.out.println("Sin estudiantes válidos");
        } else {
            porcentajeAprobados = (double) aprobados / considerados * 100;
            System.out.println("Estudiantes considerados: " + considerados);
            System.out.printf("Aprobados: %d (%.2f %%)%n", aprobados, porcentajeAprobados);
            System.out.printf("Promedio general: %.2f%n", sumaPromedios / considerados);
            System.out.printf("Mejor promedio: %s (%.2f)%n", mejorEstudiante, mejorPromedio);
        }

        teclado.close();
    }
}
