import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dime el radio de tu círculo: ");
        int radio = scanner.nextInt();

        System.out.println((radio*radio)*Math.PI);
        scanner.close();
    }
}
