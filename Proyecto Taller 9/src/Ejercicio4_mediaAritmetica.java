
/**
 * Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética y
 * cuantos están por debajo de la medía aritmética.
 * int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 * @author Usuario juampyz7
 */
public class Ejercicio4_mediaAritmetica {

    public static void main(String[] args) {
        int[] mediaAritmetica = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int suma = 0;
        for (int num : mediaAritmetica) {
            suma += num;
        }
        double media = (double) suma / mediaAritmetica.length;
        int arribadeMedia = 0;
        int abajodeMedia = 0;
        for (int num : mediaAritmetica) {
            if (num > media) {
                arribadeMedia++;
            } else if (num < media) {
                abajodeMedia++;
            }
        }
        System.out.println("La Media aritmetica es de: " + media);
        System.out.println("Los elementos que estan por encima de la media son: " + arribadeMedia);
        System.out.println("Los elementos que estan por debajo de la media son: " + abajodeMedia);
    }
}

/**
 * run:
 * La Media aritmetica es de: 9.538461538461538
 * Los elementos que estan por encima de la media son: 8
 * Los elementos que estan por debajo de la media son: 5
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */
