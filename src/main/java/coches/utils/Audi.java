package coches.utils;

import coches.interfaces.CalcularPrecio;

public class Audi extends Coche implements CalcularPrecio {
    public Audi() {
        super("Audi");
    }

    @Override
    public int calcularPrecio() {
        return 25000;
    }
}
