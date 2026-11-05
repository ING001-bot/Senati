package practica_java;
import java.util.Scanner;

public class Main_Practica_do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int resultadopositivo = 0;
        int resultadonegativo = 0;
        int positivos = 0;
        int negativos = 0;

        do {
            System.out.println("Ingrese un número: ");
            numero = sc.nextInt();
            if (numero > 0) {
                resultadopositivo += numero;
                positivos++;
            } else if (numero < 0) {
                resultadonegativo += numero;
                negativos++;
            } else {
                System.out.println("El número ingresado es cero, se detendrá el programa.");
            }
        } while (numero != 0);
        System.out.println("Suma de positivos: " + resultadopositivo);
        System.out.println("Suma de negativos: " + resultadonegativo);
        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);

    }
}
