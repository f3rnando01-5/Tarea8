/*
Suma de digitos
El programa toma un numero entero y suma sus dígitos.
 */
package programas;

import java.util.Scanner;

public class Ejercicio1
   //Entrada de datos
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();
        int suma = 0;

        // Bucle para sumar los dígitos 
        for (int i = numero; i > 0; i /= 10) {
            suma += i % 10;
        }

        // Salida de datos
        System.out.println("La suma de los dígitos es: " + suma);

        
    }
}