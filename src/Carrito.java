import java.util.ArrayList;

public class Carrito {
    private static Integer contador = 1;
    private Integer id;
    private ArrayList<Comprable> listaComprables;

    public Carrito() {
        this.id = contador++;
        this.listaComprables = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }



    public double getPrecio() {
        double total = 0.0;
        for (Comprable comprable : listaComprables) {
            total += comprable.getPrecio();
        }
        return total;
    }

    public void mostrarProductos() {
        if (this.listaComprables.isEmpty()) {
            System.out.println("El carrito esta vacio.");
        }
        else {
        System.out.println("El carrito tiene:");
        for (Comprable comprable : listaComprables) {
            System.out.println(comprable.getNombre());
            }
        }
    }

    public void agregarComprable(Comprable comprable) {
        listaComprables.add(comprable);
    }

    public void comprar() {
        System.out.println("tienes que pagar: " + this.getPrecio());
        listaComprables.clear();
    }


}
