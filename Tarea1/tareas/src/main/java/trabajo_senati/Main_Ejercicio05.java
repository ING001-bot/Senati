package trabajo_senati;

import java.util.Scanner;

public class Main_Ejercicio05 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        char plan, atencion;
        double monto, cobertura = 0, deducible = 0, tope;
        double pagoAseguradora, pagoPaciente;

        System.out.println("----- COBERTURA DE SEGURO DE SALUD -----");
        System.out.println("Planes: B = Básico, P = Plus, F = Full");
        System.out.print("Ingrese el plan: ");
        plan = teclado.next().toUpperCase().charAt(0);

        if (plan != 'B' && plan != 'P' && plan != 'F') {
            System.out.println("Plan no válido");
            teclado.close();
            return;
        }

        System.out.println("Tipos de atención: C = Consulta, E = Emergencia, H = Hospitalización");
        System.out.print("Ingrese el tipo de atención: ");
        atencion = teclado.next().toUpperCase().charAt(0);

        if (atencion != 'C' && atencion != 'E' && atencion != 'H') {
            System.out.println("Tipo de atención no válido");
            teclado.close();
            return;
        }

        System.out.print("Ingrese el monto de la atención: ");
        monto = teclado.nextDouble();

        if (atencion == 'C') {
            deducible = 0;
        } else if (atencion == 'E') {
            deducible = 50;
        } else {
            deducible = 200;
        }

        if (plan == 'B') {
            tope = 5000;
            if (atencion == 'C') {
                cobertura = 0.60;
            } else if (atencion == 'E') {
                cobertura = 0.70;
            } else {
                cobertura = 0.50;
            }
        } else if (plan == 'P') {
            tope = 15000;
            if (atencion == 'C') {
                cobertura = 0.80;
            } else if (atencion == 'E') {
                cobertura = 0.90;
            } else {
                cobertura = 0.70;
            }
        } else {
            tope = 50000;
            if (atencion == 'C') {
                cobertura = 1.00;
            } else if (atencion == 'E') {
                cobertura = 1.00;
            } else {
                cobertura = 0.90;
            }
        }

        if (monto <= deducible) {
            pagoAseguradora = 0;
        } else {
            pagoAseguradora = (monto - deducible) * cobertura;
            if (pagoAseguradora > tope) {
                pagoAseguradora = tope;
            }
        }

        pagoPaciente = monto - pagoAseguradora;

        System.out.printf("Paga la aseguradora: S/ %.2f%n", pagoAseguradora);
        System.out.printf("Paga el paciente: S/ %.2f%n", pagoPaciente);

        teclado.close();
    }
}
