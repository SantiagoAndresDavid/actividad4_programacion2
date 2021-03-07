package edu.unicesar.taller4.soluciones;

import java.util.Scanner;

public class TestCuenta {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta();
        System.out.printf("ingresa la cantidad deseada: ");
        int cantidad = scanner.nextInt();


    }
}

class Cuenta {
    int noCuenta;
    String nombreClienta;
    double saldo;

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getNombreClienta() {
        return nombreClienta;
    }

    public void setNombreClienta(String nombreClienta) {
        this.nombreClienta = nombreClienta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean consignar(double saldo, int cantidad) {
        if (cantidad > saldo) {
            return false;
        }
        saldo -= cantidad;
        return true;
    }


    public boolean retirar(int cantidad) {
        if (cantidad > saldo) {
            return false;
        }
        cantidad -= saldo;
        return true;
    }


    public boolean consignar(int cantidad) {
        if (cantidad < saldo) {
            return false;
        }
        cantidad += saldo;
        return true;
    }


}