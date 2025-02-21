package src.aplicacion;
import java.util.Scanner;
import src.mates.*;


/**
 * clase de donde se ejecuta
 * @author Genesis Chicaiza
 */

public class Principal {

    public static void main(String[] args) {
        /**
         * Usa la clase Matematicas para realizar el calculo de forma recursiva y muestra el resultado
         * @param args: argumentos
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de pasos para la aproximacion de Pi: ");
        long pasos = sc.nextLong();

        double aproximacion = Matematicas.generarNumero(pasos);

        System.out.println("aproximacion de Pi: " + aproximacion);

        sc.close();
    }
}