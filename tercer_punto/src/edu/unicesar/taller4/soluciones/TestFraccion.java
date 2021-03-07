package edu.unicesar.taller4.soluciones;

public class TestFraccion {
    public static void main() {
        Fraccion fraccion1 = new Fraccion(1, 2);
        fraccion1.sumarFraccion(3,5);

    }
}

class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void sumarFraccion(int numerador2, int denominador2) {
        int sumaNumerador = (numerador * denominador2) + (numerador2 * denominador);
        int sumaDenominador =(denominador * denominador2);


        System.out.printf("La suma de las fracciones es: %d/%d\n",sumaNumerador , sumaDenominador);
    }

    public void restarFraccion( int numerador2, int denominador2) {
        int restaNumerador = (numerador * denominador2) - (numerador2 * denominador);
        int restaDenominador =  (denominador * denominador2);
        System.out.printf("la resta del a fraccion es: %d/%d\n",restaNumerador , restaDenominador);
    }

    public void multiplicacionFraccion(int numerador2, int denominador2) {
        int multiplicacionNumerador = (numerador * numerador2);
        int multipliacionDenominador = (denominador * denominador2);

        System.out.printf("la resta del a fraccion es: %d\n",multiplicacionNumerador ,multipliacionDenominador );
    }

    public void divisionFraccion( int numerador2, int denominador2) {
        int divisionNumerador = (numerador * denominador2);
        int divisionDenominador = (denominador * numerador2);

        System.out.printf("la resta del a fraccion es: %d\n",divisionNumerador , divisionDenominador);
    }

}






