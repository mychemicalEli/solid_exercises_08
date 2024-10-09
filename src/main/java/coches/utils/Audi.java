package coches.utils;

import coches.interfaces.Coche;

public class Audi implements Coche {
    private String marca;

    public Audi() {
        this.marca = "Audi";
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public int getPrecio() {
        return 25000;
    }
}
