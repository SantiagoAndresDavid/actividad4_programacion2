package edu.unicesar.taller4.soluciones;

public class TestRectangulo {
    public static void main() {
        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        Rectangulo rectangulo2 = new Rectangulo(10,12);
        Rectangulo rectangulo3 = new Rectangulo(80,10);

        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
        rectangulo1.mostrarInformacion();
        rectangulo2.mostrarInformacion();
        rectangulo3.mostrarInformacion();
    }
}

class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {

        this.base = base;
        this.altura = altura;

    }
    public void mostrarInformacion(){

        System.out.println(" \trectangulo\n");
        System.out.printf("base: %d\n",base);
        System.out.printf("altura: %d\n",altura);
        System.out.printf("Area: %d\n", base * altura);
        System.out.printf("Perimetro: %d\n", 2 * (base + altura ));
    }
}