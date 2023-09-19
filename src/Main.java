// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Papas Fritas",10.0);
        Producto producto2 = new Producto("Hamburguesa",20.0);
        Producto producto3 = new Producto("Coca",10.0);
        Combo combo1 = new Combo("Combo1",10);

        combo1.agregarComprable(producto1);
        combo1.agregarComprable(producto2);
        combo1.agregarComprable(producto3);

      //  combo1.getProductosCombo();
      //  System.out.println(combo1.getPrecio());

        Carrito carrito = new Carrito();

        carrito.agregarComprable(combo1);
        carrito.agregarComprable(producto2);

        System.out.println(carrito.getPrecio());
        carrito.comprar();
        carrito.mostrarProductos();

        Combo combo2 = new Combo("Doble combo",10,combo1,combo1);
        combo1.getProductosCombo();
    }
}