package trabajo_senati;

import java.util.Scanner;

public class Main_Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double deuda, pago, pagoMinimo, saldoPendiente;
        double porcentajeInteres, interes, mora, nuevoSaldo;
        int diasAtraso;
        char tarjeta;

        System.out.println("----- PAGO DE TARJETA DE CREDITO -----");
        System.out.print("Ingrese la deuda total: ");
        deuda = teclado.nextDouble();
        System.out.print("Ingrese el pago realizado: ");
        pago = teclado.nextDouble();
        System.out.print("Ingrese los días de atraso: ");
        diasAtraso = teclado.nextInt();
        System.out.print("Tipo de tarjeta (C = Clásica, G = Gold): ");
        tarjeta = teclado.next().toUpperCase().charAt(0);

        if (pago >= deuda) {
            System.out.println("Deuda cancelada. Sin intereses");
            teclado.close();
            return;
        }

        if (deuda < 50) {
            pagoMinimo = deuda;
        } else if (deuda * 0.05 < 50) {
            pagoMinimo = 50;
        } else {
            pagoMinimo = deuda * 0.05;
        }

        if (tarjeta == 'C') {
            porcentajeInteres = 0.035;
        } else if (tarjeta == 'G') {
            porcentajeInteres = 0.028;
        } else {
            System.out.println("Tipo de tarjeta no válido");
            teclado.close();
            return;
        }

        saldoPendiente = deuda - pago;
        interes = saldoPendiente * porcentajeInteres;
        mora = 0;

        if (pago < pagoMinimo) {
            mora = saldoPendiente * 0.001 * diasAtraso;
            if (mora > saldoPendiente * 0.10) {
                mora = saldoPendiente * 0.10;
            }
            System.out.println("Estado: En mora");
        } else {
            System.out.println("Estado: Al día");
        }

        nuevoSaldo = saldoPendiente + interes + mora;

        System.out.printf("Pago mínimo: S/ %.2f%n", pagoMinimo);
        System.out.printf("Saldo pendiente: S/ %.2f%n", saldoPendiente);
        System.out.printf("Interés: S/ %.2f%n", interes);
        System.out.printf("Mora: S/ %.2f%n", mora);
        System.out.printf("Nuevo saldo: S/ %.2f%n", nuevoSaldo);

        teclado.close();
    }
}
