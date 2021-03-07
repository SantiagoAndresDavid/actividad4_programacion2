package edu.unicesar.taller4.soluciones;

public class TestCarro {
    public static void main() {
        Carro carro1 = new Carro("amarillo", "BMW", "BMW X1", 200, 4, "cum133");
        Carro carro2 = new Carro("rojo", "mazda", "3", 34352, 7, "qtp300");
        Carro carro3 = new Carro("verde", "ferrari", "812 GTS", 400, 2, "xdd244");

        carro1.mostrarInformacion();
        carro1.setColor("negro");
        System.out.printf("el nuevo color es: %s\n", carro1.getColor());
        carro2.mostrarInformacion();
        carro2.setColor("azul");
        System.out.printf("el nuevo color es:%s\n", carro2.getColor());
        carro3.mostrarInformacion();
        carro3.setColor("morado");
        System.out.printf("el nuevo color es: %s\n", carro3.getColor());
    }
}

class Carro {
    private String color;
    private String marca;
    private String modelo;
    private int caballos;
    private int puertas;
    private String matricula;

    public Carro(String color, String marca, String modelo, int caballos, int puertas, String matricula) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.caballos = caballos;
        this.puertas = puertas;
        this.matricula = matricula;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void mostrarInformacion() {
        System.out.println("\n\tTu auto destinado es\n");
        System.out.printf("Color del auto: %s\n", color);
        System.out.printf("Marva del auto: %s\n", marca);
        System.out.printf("modelo del auto: %s\n", modelo);
        System.out.printf("caballos de fuerza: %d\n ", caballos);
        System.out.printf("numero de puertas: %d\n", puertas);
        System.out.printf("numero de la matricula %s\n", matricula);

    }
}
