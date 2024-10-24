import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Operaciones operaciones =new Operaciones();

        int opcion;
        boolean continuar = true;
        while (continuar) {
            System.out.println("Bienvenido al sistema");
            System.out.println("1. Ingresar un numero");
            Double n1 = sc.nextDouble();
            operaciones.setN1(n1);
            System.out.println("2. Ingresar el segundo numero");
            Double n2 = sc.nextDouble();
            operaciones.setN2(n2);
            /* menu*/
            System.out.println("\tAcciones a realizar\t\n ");
            System.out.println("1. suma");
            System.out.println("2. Raiz");
            System.out.println("3. Seno");
            System.out.println("4. Coseno");
            System.out.println("5. Tangente");
            System.out.println("6. Salir");
            System.out.println("Ingresa una opcion:");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(operaciones.Sumar());
                    break;
                case 2:
                    System.out.println("La raiz del primer numero es:");
                    System.out.println(operaciones.Raiz1());
                    System.out.println("La raiz del segundo numero es:");
                    System.out.println(operaciones.Raiz2());
                    break;
                case 3:
                    System.out.println("El seno del primer numero es: ");
                    System.out.println(operaciones.Seno1());
                    System.out.println("El seno del segundo numero es: ");
                    System.out.println(operaciones.Seno2());
                    break;
                case 4:
                    System.out.println("El coseno del primer numero es: ");
                    System.out.println(operaciones.Cos1());
                    System.out.println("El coseno del segundo numero es: ");
                    System.out.println(operaciones.Cos2());
                    break;
                case 5:
                    System.out.println("La tangente del primer numero es: ");
                    System.out.println(operaciones.Tan1());
                    System.out.println("El tangente del segundo numero es: ");
                    System.out.println(operaciones.Tan2());
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println(("Opcion no valida, ingrese nuevamente"));
                    break;
            }
        }
    }
}