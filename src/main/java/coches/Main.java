package coches;

import coches.interfaces.Coche;
import coches.printer.CochePrinter;
import coches.utils.Audi;
import coches.utils.Renault;

public class Main {
    public static void main(String[] args) {
        Coche[] arrayCoches = {
                new Renault(),
                new Audi()
        };

        CochePrinter printer = new CochePrinter(arrayCoches);
        printer.imprimirPrecioMedioCoche();
    }

}