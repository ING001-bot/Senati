package practica_java;
import java.util.Scanner;

public class Main_switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1,num2,resultado;
        System.out.println("Ingrese el primer número: ");
        num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número: ");  
        num2 = sc.nextDouble();
        System.out.println("Ingrese la opción (1: suma, 2: resta, 3: multiplicación, 4: división): ");
        opcion = sc.nextInt();
        switch(opcion){
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                if( num2 ==0){
                    System.out.println("No se puede dividir entre cero");
                    break;
                } else {
                    resultado =  num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } break;
                
            default:
                System.out.println("Opción no válida");
        }
    }
}
