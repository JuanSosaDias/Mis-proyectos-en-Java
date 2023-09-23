//Dados 2 números, el algoritmo dirá cual es el mayor :D
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa 2 numeros enteros: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.println("El numero " + numero1 + " es mayor.");
        }
        if (numero2 > numero1) {
            System.out.println("El numero " + numero2 + " es mayor.");
        }
        else {
            System.out.println("Son iguales, osea que el mayor es" + numero1);
        }
    }
}
