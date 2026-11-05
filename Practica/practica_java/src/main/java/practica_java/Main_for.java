package practica_java;

public class Main_for {
    public static void main(String[] args) {
        
        /*for (int contador = 2; contador <=20; contador+=2) {
            System.out.println("Contador: " + contador);
        }*/
       /*for (int i = 1; i <= 10; i++){
            if (i==3 || i==7 ){
                continue;
            }
            if ( i==9){
                break;
            }
            System.out.println("i: " + i);
       }*/
       int suma = 0;
       for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                suma += i;
            }
       }
       System.out.println("Suma de pares: " + suma);
    }
    
}
