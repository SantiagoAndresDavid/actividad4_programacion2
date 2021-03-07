package edu.unicesar.taller4.soluciones;


import sun.nio.cs.ext.MacThai;

public class TestTriangulo {
    public static void main(){

    }
class Triangulo {
    private int base;
    private int altura;
    private int angulo;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Triangulo(int base, int altura,int angulo) {
        this.base = base;
        this.altura = altura;
        this.angulo = angulo;
    }


    public void mostrarInformacion(){

        System.out.println(" \tTriangulo\n");
        System.out.printf("base: %d\n",base);
        System.out.printf("altura: %d\n",altura);
        System.out.printf("Area: %.2f\n", base * altura);
        System.out.printf("Perimetro: %.2f\n", 2 * (base + altura ));
        System.out.printf("la medida de los dos lados iguales: %d\n",Math.sqrt(Math.pow(base/2,2)+ Math.pow(altura,2)));
        System.out.printf("el valor del ángulo vértice: %d\n",180 - (angulo*2));

    }

}













}
