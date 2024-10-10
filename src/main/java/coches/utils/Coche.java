package coches.utils;

public abstract class Coche {
    private String marca;

    public Coche(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

}