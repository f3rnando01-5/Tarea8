/*
Números primos del 1 al 100
Este programa imprime todos los números primos entre el 1 y el 100.
 */
package programas;

public class Ejercicio2 {
//entrada de datos
    public static void main(String[] args) {
        System.out.println("Numeros primos entre 1 y 100:");
        //bucle para hallar numero pri,mo
        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            //salida de datos
            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}