package edu.unicesar.taller4.soluciones;

public class TestProductos {
    public static void main() {
        Producto producto1 = new Producto(1234, "Arina", 3000, 5000,70);
        Producto producto2 = new Producto(1999, "xd", 5000, 3000,80);

        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }

        producto1.mostarInformacion();
        producto1.setCodigo(1460);
        System.out.printf("nuevo codigo: %d\n", producto1.getCodigo());
        producto2.mostarInformacion();
        producto2.setCodigo(1190);
        System.out.printf("nuevo codigo: %d\n",producto2.getCodigo());

    }
}

class Producto {
    private int codigo;
    private String nombre;
    private int precioCompra;
    private int precioVenta;
    private double rentabilidad;

    public double getRentabilidad() {
        return rentabilidad;
    }

    public void setRentabilidad(double rentabilidad) {
        this.rentabilidad = rentabilidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Producto(int codigo, String nombre, int precioCompra, int precioVenta,double rentabilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.rentabilidad = rentabilidad;

    }
    public void mostarInformacion(){
        System.out.println("\n\tinformacion del producto\n");
        System.out.printf("nombre del producto: %s\n",nombre);
        System.out.printf("codigo del producto: %d\n",codigo);
        System.out.printf("retablilidad del producto: %.2f\n",rentabilidad);
        System.out.printf("precio de compra: $ %s\n",precioCompra);
        System.out.printf("precio de venta: $  %.2f\n",precioCompra*(100/(100-rentabilidad)));






    }
}
