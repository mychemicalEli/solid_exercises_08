package coches;

public class Main {
    public static void main(String[] args) {
        Coche[] arrayCoches = {
                new Coche("Renault"),
                new Coche("Audi")
        };
        imprimirPrecioMedioCoche(arrayCoches);
    }

    public static void imprimirPrecioMedioCoche(Coche[] arrayCoches){
        for (Coche coche : arrayCoches) {
            if(coche.getMarca().equals("Renault")) System.out.println(18000);
            if(coche.getMarca().equals("Audi")) System.out.println(25000);
        }
    }

}