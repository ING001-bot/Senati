package trabajo_senati;

import java.util.Scanner;

public class Main_Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char tipo;
        int segundos, minutos, minutosLocalesGratis = 0;
        int minutosGratisEstaLlamada, minutosCobrar;
        int numeroLlamada = 0;
        double tarifa, costoLlamada, totalSinIGV = 0;
        double igv, totalPagar;
        boolean suspendido = false;

        System.out.println("----- FACTURACION DE LLAMADAS -----");
        System.out.println("L = Local (S/ 0.08/min), N = Nacional (S/ 0.15/min)");
        System.out.println("I = Internacional (S/ 0.90/min), F = Finalizar");

        System.out.print("Tipo de llamada (L/N/I/F): ");
        tipo = teclado.next().toUpperCase().charAt(0);

        while (tipo != 'F' && !suspendido) {
            System.out.print("Duración en segundos: ");
            segundos = teclado.nextInt();

            if (tipo != 'L' && tipo != 'N' && tipo != 'I') {
                System.out.println("Tipo de llamada no válido");
            } else {
                minutos = (segundos + 59) / 60;
                numeroLlamada++;
                costoLlamada = 0;

                if (tipo == 'L') {
                    tarifa = 0.08;
                    minutosGratisEstaLlamada = Math.min(minutos, 60 - minutosLocalesGratis);
                    minutosLocalesGratis += minutosGratisEstaLlamada;
                    minutosCobrar = minutos - minutosGratisEstaLlamada;
                    costoLlamada = minutosCobrar * tarifa;
                    System.out.printf("Llamada %d (local): %d min - S/ %.2f%n",
                            numeroLlamada, minutos, costoLlamada);
                } else if (tipo == 'N') {
                    tarifa = 0.15;
                    costoLlamada = minutos * tarifa;
                    System.out.printf("Llamada %d (nacional): %d min - S/ %.2f%n",
                            numeroLlamada, minutos, costoLlamada);
                } else {
                    tarifa = 0.90;
                    costoLlamada = minutos * tarifa;
                    System.out.printf("Llamada %d (internacional): %d min - S/ %.2f%n",
                            numeroLlamada, minutos, costoLlamada);
                }

                totalSinIGV += costoLlamada;

                if (totalSinIGV > 50.00) {
                    System.out.println("Servicio suspendido por exceder el límite");
                    suspendido = true;
                }
            }

            if (!suspendido) {
                System.out.print("Tipo de llamada (L/N/I/F): ");
                tipo = teclado.next().toUpperCase().charAt(0);
            }
        }

        igv = totalSinIGV * 0.18;
        totalPagar = totalSinIGV + igv;

        System.out.println("Minutos locales gratis usados: " + minutosLocalesGratis);
        System.out.printf("Total sin IGV: S/ %.2f%n", totalSinIGV);
        System.out.printf("IGV: S/ %.2f%n", igv);
        System.out.printf("Total a pagar: S/ %.2f%n", totalPagar);

        teclado.close();
    }
}
