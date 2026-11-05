package practica_java;

public class Main_while {
    public static void main(String[] args) {
        
        /*int contador = 10;
        while (contador <= 11 && contador >= 1) {
            System.out.println("Contador: " + contador);
            contador--;
        }
        while (contador >= 1) {
            System.out.println("Contador: " + contador);
            contador--;
        }*/
        
            int contador = 2;
            int suma = 0;

            while (contador <= 10) {

                suma += contador;

                contador+=2;
            }

            System.out.println("Suma: " + suma);
           

    }
}
