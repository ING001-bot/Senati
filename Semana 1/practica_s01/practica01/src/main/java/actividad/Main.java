package actividad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
    //Variable Datos de entrada
    int  CantPollos, CantCuartosP, CantGaseosas;
    double porcentajePropinas;
    int NumPersonas;

    //Precios del negocio
    double PrecioPentero = 65.00;
    double PrecioCuarto = 20.00;
    double PrecioGaseosas = 10.00;

    double descuentoApp = 0.05;

    //Variables del proceso
    double consumo, descuento, consumoDescuento, propina, totalPagar, pagoPersona;

    //Ingresar Datos
    System.out.println("Cantidad de Pollos enteros: ");
    CantPollos = sc.nextInt();

    System.out.println("Cantidad de Cuartos de Pollo: ");
    CantCuartosP = sc.nextInt();

    System.out.println("Cantidad de Gaseosas: ");
    CantGaseosas = sc.nextInt();

    System.out.println("Porcentaje de Propina: ");
    porcentajePropinas = sc.nextDouble();

    System.out.println("Cantidad de Personas: ");
    NumPersonas = sc.nextInt();
    
    //Proceso
    consumo = (CantPollos * PrecioPentero)
            + (CantCuartosP * PrecioCuarto)
            + (CantGaseosas * PrecioGaseosas);
    
    //Calculamos el descuento
    descuento = consumo * descuentoApp;
    
    //calculamos el consumo despues del descuento 
    consumoDescuento = consumo - descuento;

    //calculamos la propina
    propina = consumoDescuento * (porcentajePropinas / 100);

    //calculamos el total a pagar
    totalPagar = consumoDescuento - propina;

    //calculamos cuanto le toca pagar a cada persona
    pagoPersona = totalPagar / NumPersonas;


    //Mostrar Salida   
    
    System.out.printf("Consumo: S/ %.2f%n", consumo);

    System.out.printf("Descuento: S/ %.2f%n", descuento);

    System.out.printf("Propina: S/ %.2f%n", propina);

    System.out.printf("Total a pagar: S/ %.2f%n", totalPagar);

    System.out.printf("Pago por persona: S/ %.2f%n", pagoPersona);
    }
}