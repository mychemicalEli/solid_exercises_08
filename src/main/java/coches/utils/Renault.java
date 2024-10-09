package coches.utils;

import coches.interfaces.Coche;

public class Renault implements Coche {
    private String marca;

    public Renault() {
        this.marca = "Renault";
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public int getPrecio() {
        return 18000;
    }
}
