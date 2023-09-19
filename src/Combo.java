import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combo implements Comprable{
    private String nombre;
    private Integer descuento;
    private List<Comprable> listaComprable;

    public Combo(String name, Integer descuento, Comprable... listaDeProductos) {
        this.listaComprable = Arrays.stream(listaDeProductos).toList();
        this.descuento = descuento;
        this.nombre = name;
    }


    public Combo(String name, Integer descuento){
        this.nombre = name;
        this.descuento = descuento;
        this.listaComprable = new ArrayList<>();
    }

    public void agregarComprable(Comprable comprable) {
        listaComprable.add(comprable);
    }

    public void quitarComprable(Comprable comprable) {
        listaComprable.remove(comprable);
    }


    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public Double getPrecio() {
    double total = 0.0;
        for (Comprable comprable : listaComprable) {
            total += comprable.getPrecio();
        }
        return total * (100 - (double) descuento)/100;
    }

    public void getProductosCombo() {
        System.out.println("El " + this.getNombre() + " tiene:");
        for (Comprable comprable : listaComprable) {
            System.out.println(comprable.getNombre());
        }
    }
}
