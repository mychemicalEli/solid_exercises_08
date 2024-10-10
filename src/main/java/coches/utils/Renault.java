package coches.utils;

import coches.interfaces.CalcularPrecio;

public class Renault extends Coche implements CalcularPrecio {
    public Renault() {
        super("Renault");
    }

    @Override
    public int calcularPrecio() {
        return 18000;
    }
}