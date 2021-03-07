package edu.unicesar.taller4.soluciones;

public class TestBicicleta {
    public static void main() {
        Bicicleta bicicleta1 = new Bicicleta(19, 2, 2);
        Bicicleta bicicleta2 = new Bicicleta(50, 9, 1);


        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }

        bicicleta1.mostarInfomracion();
        bicicleta1.setPiñonActual(4);
        System.out.printf("el piñon actual es: %d\n", bicicleta1.getPiñonActual());
        bicicleta1.setPlatoActual(7);
        System.out.printf("el plato actual es: %d\n", bicicleta1.getPlatoActual());
        bicicleta1.frenar();
        bicicleta1.acelerar();

        bicicleta2.mostarInfomracion();
        bicicleta2.setPiñonActual(6);
        System.out.printf("el piñon actual es: %d\n", bicicleta2.getPiñonActual());
        bicicleta2.setPlatoActual(9);
        System.out.printf("el plato actual es: %d\n", bicicleta2.getPlatoActual());
        bicicleta2.frenar();
        bicicleta2.acelerar();
    }
}

class Bicicleta {
    private int velocidadActual;
    private int platoActual;
    private int piñonActual;


    public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.piñonActual = piñonActual;
    }


    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public int getPiñonActual() {
        return piñonActual;
    }

    public void setPiñonActual(int piñonActual) {
        this.piñonActual = piñonActual;
    }


    public void acelerar(){
        System.out.printf("aumento de velocidad: %d m/s\n ", velocidadActual * 2);
    }

    public void frenar() {
        System.out.printf("la dismunicion de velocidad: %d m/s\n  ", velocidadActual / 2);
    }

    public void mostarInfomracion() {
        System.out.printf("\n\testatus de tu bicicleta\n");
        System.out.printf("velocidad de la bicicleta: %d\n", velocidadActual);
        System.out.printf("el piñon anterior es: %d\n", piñonActual);
        System.out.printf("el plato anterior es: %d\n", platoActual);


    }
}
