package edu.unicesar.taller4.soluciones;

import java.util.Scanner;

public class TestLibro {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Libro libro1 = new Libro();
        System.out.println("ingresa el nombre del libro");
        libro1.setNombre(scanner.nextLine());
        System.out.println("ingrese el primer nombre");
        libro1.setPrimerNombre(scanner.nextLine());
        System.out.println("ingrese el segundo nombre");
        libro1.setSegundoNombre(scanner.nextLine());
        System.out.println("ingrese el primer apellido");
        libro1.setPrimerApellido(scanner.nextLine());
        System.out.println("ingrese el ISBN");
        libro1.setISBN(scanner.nextLine());
        System.out.println("ingrese el numero de paginas");
        libro1.setPaginas(scanner.nextLine());
        System.out.println("ingrese el numero de edición");
        libro1.setEdicion(scanner.nextLine());
        System.out.println("ingrese cual es la editorial");
        libro1.setEditorial(scanner.nextLine());
        System.out.println("ingrese la ciudad de publicacion");
        libro1.setCiudad(scanner.nextLine());
        System.out.println("ingrese el pais");
        libro1.setPais(scanner.nextLine());
        System.out.println("ingrese la fecha de edicion");
        libro1.setFechaEdicion(scanner.nextLine());

        libro1.mostrarInformacion();
        System.out.printf("Titulo: %s\n", libro1.getNombre());
        System.out.printf("%s edicion\n",libro1.getEdicion());
        System.out.printf("Autor:%s %s %s\n",libro1.getPrimerNombre(),libro1.getSegundoNombre(),libro1.getPrimerApellido());
        System.out.printf("ISBN: %s\n",libro1.getISBN());
        System.out.printf("%s,%s,%s\n",libro1.getCiudad(),libro1.getPais(),libro1.getFechaEdicion());
        System.out.printf("%s paginas\n",libro1.getPaginas());


    }
}

class Libro {
    private String nombre;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String ISBN;
    private String paginas;
    private String edicion;
    private String editorial;
    private String ciudad;
    private String pais;
    private String fechaEdicion;


    public Libro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(String fechaEdicion) {
        this.fechaEdicion = fechaEdicion;

    }
public void mostrarInformacion(){

    }
}