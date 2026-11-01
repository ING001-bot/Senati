package demo_s01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       //Definir variables
       double comision = 1.50;

       //Datos de entrada
       System.out.print("Nombre de cliente: ");
       String nombre = sc.next();
       System.out.print("Saldo de la cuenta: ");
       double saldo = sc.nextDouble();
       System.out.print("Monto a retira: ");
       int monto = sc.nextInt();

       //Proceso
        //Responde cuntos de billetes de cada denominacion se entregara al cliente

        int billetes200  = monto / 200;
        int resto = monto % 200;

        int billetes100 = resto / 100;
        resto = resto % 100;

        int billetes50 = resto / 50;
        resto = resto % 50;

        int billetes20 = resto / 20;
        resto = resto % 20;

        int billetes10 = resto / 10;

        int totalBilletes = billetes200 + billetes100 + billetes50 + billetes20 + billetes10;
        double saldoFinal = saldo - monto - comision;

        //Datos de salida
        System.out.println("Nombre de cliente: " + nombre);
        System.out.println("Saldo de la cuenta: " + saldo);
        System.out.println("Monto a retirar: " + monto);
        System.out.println("Comision: " + comision);
        System.out.println("Saldo final: " + saldoFinal);
        System.out.println("Total de billetes: " + totalBilletes);
        
        System.out.println("Billetes de 200: " + billetes200);
        System.out.println("Billetes de 100: " + billetes100);
        System.out.println("Billetes de 50: " + billetes50);
        System.out.println("Billetes de 20: " + billetes20);
        System.out.println("Billetes de 10: " + billetes10);
    }
}