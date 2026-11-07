package trabajo_senati;

import java.util.Scanner;

public class Main_Ejercicio10 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        double pesoPaquete, pesoTotal = 0, porcentajeOcupacion;
        double capacidad = 1000, pesoMasPesado = 0, espacioDisponible;
        int cargados = 0, rechazados = 0;
        boolean camionLleno = false;

        System.out.println("----- CARGA DE UN CAMION -----");
        System.out.println("Capacidad máxima: 1000 kg");
        System.out.print("Ingrese el peso del paquete en kg (0 para terminar): ");
        pesoPaquete = teclado.nextDouble();

        while (pesoPaquete != 0 && !camionLleno) {
            espacioDisponible = capacidad - pesoTotal;

            if (pesoPaquete > 200) {
                System.out.println("Paquete rechazado: excede 200 kg");
                rechazados++;
            } else if (pesoPaquete > espacioDisponible) {
                System.out.printf("Paquete rechazado: no cabe (quedan %.1f kg)%n",
                        espacioDisponible);
                rechazados++;
            } else {
                pesoTotal += pesoPaquete;
                cargados++;

                if (pesoPaquete > pesoMasPesado) {
                    pesoMasPesado = pesoPaquete;
                }

                System.out.printf("Paquete %d cargado: %.1f kg - Total: %.1f kg%n",
                        cargados, pesoPaquete, pesoTotal);

                if (pesoTotal >= capacidad * 0.95) {
                    System.out.println("Camión lleno");
                    camionLleno = true;
                }
            }

            if (!camionLleno) {
                System.out.print("Ingrese el peso del paquete en kg (0 para terminar): ");
                pesoPaquete = teclado.nextDouble();
            }
        }

        porcentajeOcupacion = pesoTotal / capacidad * 100;

        System.out.println("Paquetes cargados: " + cargados + " | Rechazados: " + rechazados);
        System.out.printf("Peso total: %.1f kg%n", pesoTotal);
        System.out.printf("Ocupación: %.2f %%%n", porcentajeOcupacion);
        System.out.printf("Paquete más pesado: %.1f kg%n", pesoMasPesado);

        teclado.close();
    }
}
