package coches;

import coches.impresora.ImpresoraPrecios;
import coches.interfaces.CalcularPrecio;
import coches.utils.Audi;
import coches.utils.Renault;

public class Main {
    public static void main(String[] args) {
        CalcularPrecio[] arrayCoches = {
                new Renault(),
                new Audi()
        };
        ImpresoraPrecios.imprimirPrecioMedioCoche(arrayCoches);
    }

}