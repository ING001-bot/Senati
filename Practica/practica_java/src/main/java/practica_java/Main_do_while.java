package practica_java;

import java.util.Scanner;

public class Main_do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int contador = 1;
        int suma = 0;
        do {
            System.out.println("Contador: " + contador);
            suma += contador;
            contador++;
        }while (contador <= 20);
        System.out.println("Suma: " + suma);*/

        /*int contador = 1;
        int numero;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        do {
            System.out.println("Ingrese un número : ");
            numero = sc.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
                contador++;
        }while (contador <= 10);
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);*/

        /*int suma = 0;
        int numero;
        do {
            System.out.println("Ingrese un número: ");
            numero = sc.nextInt();
            suma += numero;
        }while (numero != 0);
        System.out.println("Suma: " + suma);*/

        /*int sumapositivos = 0;
        int sumanegativos = 0;
        int numero;
        do {
            System.out.println("Ingrese un número: ");
            numero = sc.nextInt();
            if (numero > 0) {
                sumapositivos += numero;
            } else if (numero < 0) {
                sumanegativos += numero;
            }
        }while (numero != 0);
        System.out.println("Suma de positivos: " + sumapositivos);
        System.out.println("Suma de negativos: " + sumanegativos);*/

       /*ouble num1, num2, resultado;
        int opcion;
        do {
            System.out.println("----------- Menú de Operaciones ---------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.println("Ingrese la opción deseada: ");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("Ingrese el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo número: ");
                    num2 = sc.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    System.out.println("Ingrese el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo número: ");
                    num2 = sc.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    System.out.println("Ingrese el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo número: ");
                    num2 = sc.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    System.out.println("Ingrese el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo número: ");
                    num2 = sc.nextDouble();
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero");
                        break;
                    } else {
                        resultado = num1 / num2;
                        System.out.println("El resultado de la división es: " + resultado);
                        break;
                    }
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while (opcion != 5);*/
    }
}