import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡¡Hola Alumno!!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un numerito");
        int askedNumber = scanner.nextInt();

        System.out.println("El numero seleccionado es: " + askedNumber);

        scanner.close();

    }
}