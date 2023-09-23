import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Hola, antes de entrar. ¿Puedo saber tu nombre?");
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println();
        String nombre = scanner.nextLine();

        System.out.println("Bienvenido Juan" + nombre );

        scanner.close();
    }
}
