/**
 * Escriba un programa que permita presentar la siguiente serie:
 * 1/2, 1/3, 2/5, 3/7, 5/11, 8/13, . . . fibonaccis / primos 
 * @author Usuario juampyz7
 */
import java.util.Scanner;
public class Ejercicio2_serie1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int lim, a = 0, b = 1, c = 0;
        int cantidad = 10, contador = 0, num = 2, i = 2;
        System.out.print("Ingresa el limite de la serie: ");
        lim = tcl.nextInt();
        int[] fibonaccis = new int[lim];
        for (i = 0; i < lim; i++) {
            a = b; b = c; c = a + b;
            fibonaccis[i] = c;
        }
        int[] primos = new int[lim];
        while (contador < cantidad) {
            for (i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i > Math.sqrt(num)) {
                primos[contador] = num;
                contador++;
            }
            num++;
        }
        for ( i = 0; i < lim; i++) {
            System.out.print(fibonaccis[i]+"/"+primos[i] + " ");
        }
    }
}

/**
 * run:
 * Ingresa el limite de la serie: 10
 * 1/2 1/3 2/5 3/7 5/11 8/13 13/17 21/19 34/23 55/29 BUILD SUCCESSFUL (total time: 2 seconds)
 */
