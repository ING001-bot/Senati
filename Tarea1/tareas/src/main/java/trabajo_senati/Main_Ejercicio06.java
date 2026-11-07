package trabajo_senati;

import java.util.Scanner;

public class Main_Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char tipo;
        int cantidad, generalesVendidas = 0, vipVendidas = 0;
        int aceptadas = 0, rechazadas = 0, numeroCompra = 0;
        int disponibles, aforoOcupado;
        double precio, monto, ingresos = 0, ocupacion;

        System.out.println("----- VENTA DE ENTRADAS -----");
        System.out.println("G = General (S/ 80), V = VIP (S/ 200), F = Finalizar");

        System.out.print("Tipo de entrada (G/V/F): ");
        tipo = teclado.next().toUpperCase().charAt(0);

        while (tipo != 'F') {
            System.out.print("Cantidad de entradas: ");
            cantidad = teclado.nextInt();

            if (tipo != 'G' && tipo != 'V') {
                System.out.println("Tipo no válido");
                rechazadas++;
            } else if (cantidad < 1 || cantidad > 6) {
                System.out.println("Cantidad no válida: debe ser de 1 a 6");
                rechazadas++;
            } else {
                if (tipo == 'G') {
                    disponibles = 12 - generalesVendidas;
                } else {
                    disponibles = 4 - vipVendidas;
                }

                if (cantidad > disponibles) {
                    System.out.println("Entradas insuficientes: quedan " + disponibles);
                    rechazadas++;
                } else {
                    if (tipo == 'G') {
                        precio = 80;
                        generalesVendidas += cantidad;
                    } else {
                        precio = 200;
                        vipVendidas += cantidad;
                    }

                    monto = cantidad * precio;
                    if (cantidad >= 4) {
                        monto = monto * 0.90;
                    }

                    ingresos += monto;
                    aceptadas++;
                    numeroCompra++;

                    System.out.printf("Compra %d: %d entradas %c - S/ %.2f%n",
                            numeroCompra, cantidad, tipo, monto);
                }
            }

            System.out.print("Tipo de entrada (G/V/F): ");
            tipo = teclado.next().toUpperCase().charAt(0);
        }

        aforoOcupado = generalesVendidas + vipVendidas;
        ocupacion = (double) aforoOcupado / 16 * 100;

        System.out.println("Entradas vendidas: General " + generalesVendidas
                + " | VIP " + vipVendidas);
        System.out.printf("Ingresos: S/ %.2f%n", ingresos);
        System.out.printf("Ocupación del aforo: %.2f %%%n", ocupacion);
        System.out.println("Compras aceptadas: " + aceptadas
                + " | Compras rechazadas: " + rechazadas);

        teclado.close();
    }
}
