import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Pasame un precio, y te paso el mismo agregándole el IVA: ");
        Scanner scanner = new Scanner(System.in);

        double precio = scanner.nextDouble();
        System.out.println("El precio final es " + precio*1.22);

        scanner.close();

    }
}
