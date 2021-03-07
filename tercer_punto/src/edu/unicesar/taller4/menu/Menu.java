package edu.unicesar.taller4.menu;

import edu.unicesar.taller4.soluciones.*;
import java.util.Scanner;

public class Menu {
    public static Scanner input = new Scanner(System.in);

    public static void inicio() {
        preguntarPunto();
    }

    public static void menuOpciones(){
        System.out.println("\tmenu\n");
        System.out.println("1.rectangulo\n");
        System.out.println("2.coche\n");
        System.out.println("3.triangulo\n");
        System.out.println("4.bicicleta\n");
        System.out.println("5.producto\n");
        System.out.println("6.libro\n");
        System.out.println("7.cuenta\n");
        System.out.println("8.reloj\n");
        System.out.println("9.fraccion\n");
    }

    public static void preguntarPunto(){
        int opcion;

        while(true){
            menuOpciones();
            System.out.println("¿ Que punto desea ejecutar ?");
            opcion = input.nextInt();

            switch (opcion){
                case 1:
                    TestRectangulo.main();
                    break;
                case 2:
                    TestCarro.main();
                    break;
                case 3:
                    TestTriangulo.main();
                case 4:
                    TestBicicleta.main();
                    break;
                case 5:
                    TestProductos.main();
                    break;
                case 6:
                    TestLibro.main();
                    break;
                case 7:
                    TestCuenta.main();
                    break;
                case 8:
                    TestReloj.main();
                    break;
                case 9:
                    TestFraccion.main();
                    break;

                default:
                    System.out.println("Fuera de rango");
                    continue;
            }
            break;
        }
    }
}


