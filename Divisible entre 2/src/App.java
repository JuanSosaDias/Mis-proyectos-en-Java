import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Dame un número y te diré si es divisible entre 2:");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Sí, es divisible entre 2.");
            } else {
                System.out.println("No, no es divisible entre 2.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero.");
        } finally {
            scanner.close();
        }
    }
}
