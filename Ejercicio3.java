/*
 Calcula el factorial de un numero
 Este programa calcula el factorial de un numero introducido por el estudiante
 */
package programas;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
 
}
}
