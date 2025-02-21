package src.mates;
import java.util.Random;

/**
 * Clase que contiene metodos para aproximar el numero Pi.
 *
 * @author Genesis Chicaiza
 */
public class Matematicas {
    /**
     * Genera una aproximación del numero Pi utilizando el método Monte Carlo de forma recursiva.
     *
     * @param pasos: La cantidad de pasos para el cálculo.
     * @return Aproximación del número Pi.
     */
    public static double generarNumero(long pasos) {
        return piRecursivo(pasos, 0, 0);
    }

    private static double piRecursivo(long pasos, long puntosCirculo, long iteracion) {
        if (iteracion == pasos) {
            return 4.0 * puntosCirculo / pasos;
        } else {
            Random random = new Random();
            double x = random.nextDouble();
            double y = random.nextDouble();

            if (Math.pow(x, 2) + Math.pow(y, 2) <= 1) {
                return piRecursivo(pasos, puntosCirculo + 1, iteracion + 1);
            } else {
                return piRecursivo(pasos, puntosCirculo, iteracion + 1);
            }
        }
    }
}