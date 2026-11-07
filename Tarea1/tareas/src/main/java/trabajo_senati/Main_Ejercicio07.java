package trabajo_senati;

import java.util.Scanner;

public class Main_Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorInicial, valorResidual, valorLibros;
        double depreciacion, depreciacionAcumulada = 0;
        int anio = 0;

        System.out.println("----- DEPRECIACION DE UN EQUIPO -----");
        System.out.print("Ingrese el valor inicial del equipo: ");
        valorInicial = teclado.nextDouble();

        valorResidual = valorInicial * 0.10;
        valorLibros = valorInicial;

        while (valorLibros > valorResidual) {
            depreciacion = valorLibros * 0.25;

            if (valorLibros - depreciacion < valorResidual) {
                depreciacion = valorLibros - valorResidual;
            }

            valorLibros = valorLibros - depreciacion;
            depreciacionAcumulada += depreciacion;
            anio++;

            System.out.printf("%d | %.2f | %.2f%n",
                    anio, depreciacion, valorLibros);
        }

        System.out.println("Años de depreciación: " + anio);
        System.out.printf("Depreciación acumulada: S/ %.2f%n", depreciacionAcumulada);

        teclado.close();
    }
}
