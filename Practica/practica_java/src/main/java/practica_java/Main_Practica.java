package practica_java;

public class Main_Practica {
    public static void main(String[] args) {
       /*  int aprobados=0;
        int desaprobados=0;
        int nota;

        for (int i = 1 ; i<=10 ; i++){
            nota = i + 8;
            System.out.println("Nota Estudiante " + i + ": " + nota);
            if (nota >=11 ){
                aprobados ++;
            } else {
                desaprobados ++;
            }
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);*/
        int desaprobados = 0;
        int aprobados = 0;
        int excelentes = 0;
        int nota;

        for (int i = 1; i <= 10; i++){
            nota = i + 8;
            if (nota >= 16 && nota <= 20){
                excelentes ++;
                System.out.println("Nota Estudiante " + i + ": " + nota );
            } else if (nota >=11 && nota <=15){
                aprobados ++;
                System.out.println("Nota Estudiante " + i + ": " + nota );
            } else {
                desaprobados ++;
                System.out.println("Nota Estudiante " + i + ": " + nota  );
            }
        }
        System.out.println("Cantidad de estudiantes con nota excelente: " + excelentes);
                System.out.println("Cantidad de estudiantes aprobados: " + aprobados);
                System.out.println("Cantidad de estudiantes desaprobados: " + desaprobados);

    }
}
