
import java.util.Scanner;

/**
 * Analice el siguiente código Scanner entrada = new Scanner(System.in);
 * String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark",
 * "Jennifer", "Alcides"}; String inicial; boolean bandera = true;
 * while(bandera){ System.out.println("Ingrese una letra"); inicial =
 * entrada.nextLine(); 
 * }
 * Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario ingrese por 
 * teclado una letra que coincida con la primera letra de los "nombres" contenidos en del 
 * arreglo estudiantes. Debe usar un ciclo repetitivo para recorrer el arreglo estudiantes, 
 * y no quemar de forma constante dichas iniciales, imagine que estudiantes podría contener 
 * millón de nombres, por lo que fijar iniciales, es ineficiente.
 * @author Usuario juampyz7
 */
public class Ejercicio6_Modificacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while (bandera) {
            System.out.print("Ingrese una letra en mayuscula: ");
            inicial = tcl.nextLine();
            for (String estudiante : estudiantes) {
                if(estudiante.charAt(0) == inicial.charAt(0)){
                    System.out.print("La letra que has ingresado coincide con la inicial de: " + estudiante);
                    bandera = false;
                    break;
                }
            }
            if(bandera){
                System.out.print("La letra que has ingresado no coincide con ninguna inicial, intenta otra vez");
            }
        }
    }
}

/**
 * run:
 * Ingrese una letra en mayuscula: K
 * La letra que has ingresado coincide con la inicial de: Kimberly
 * BUILD SUCCESSFUL (total time: 2 seconds)
 */