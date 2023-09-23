import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int numero = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un límite: ");

        int limite = scanner.nextInt();

        if (limite<=100) {
            while (numero <= limite) {
            System.out.println(numero);
            numero ++;
            }
        }
        else {
            System.out.println("Ese numero es muy largo, no tengo ganas de pensar tanto :c");
        }

        scanner.close();
    }
}
