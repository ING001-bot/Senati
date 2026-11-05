package practica_java;

public class Main {
    public static void main(String[] args) {
       
        String producto = "laptop";
        double precio = 2500.00;
        int cantidad = 2;

        double total = precio * cantidad;
        
        System.out.println("Producto: " + producto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: " + total);
    }
}