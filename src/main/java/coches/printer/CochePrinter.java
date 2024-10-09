package coches.printer;

import coches.interfaces.Coche;

public class CochePrinter {
    private Coche[] arrayCoches;

    public CochePrinter(Coche[] arrayCoches) {
        this.arrayCoches = arrayCoches;
    }

    public void imprimirPrecioMedioCoche() {
        for (Coche coche : arrayCoches) {
            System.out.println(coche.getMarca() + " cuesta: " + coche.getPrecio());
        }
    }
}
