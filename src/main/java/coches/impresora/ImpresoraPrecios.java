package coches.impresora;

import coches.interfaces.CalcularPrecio;
import coches.utils.Coche;

public class ImpresoraPrecios {
    public static void imprimirPrecioMedioCoche(CalcularPrecio[] arrayCoches) {
        for (CalcularPrecio coche : arrayCoches) {
            System.out.println("El precio medio de un " + ((Coche) coche).getMarca() + " es: " + coche.calcularPrecio());
        }
    }
}
