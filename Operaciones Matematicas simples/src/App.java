import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Ingresa el primer numero para realizar la suma y la multiplicación: ");
        int numero1 = scanner1.nextInt();

        System.out.println("Ahora el segundo: ");
        int numero2 = scanner1.nextInt();

        System.out.println("La suma da: " + (numero1 + numero2));
        System.out.println("La multiplicación da: "+(numero1 * numero2));
        
        scanner1.close();
    }
}
