import exception.ListaVaciaException;
import model.*;

import java.util.ArrayList;
import java.util.Optional;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        cargarProductos(productos);

        productos.forEach(System.out::println);
        System.out.println("=============================");
        try {
            System.out.println("Producto más caro: " + getProductoMasCaro(productos));
            System.out.println("Producto más barato: " + getProductoMasBarato(productos));
        }catch (ListaVaciaException e){
            System.out.println(e.getMessage());
        }

    }

    public static void cargarProductos(ArrayList<Producto> productos){
        Producto p1 = new Bebida("Coca-Cola Zero", 20, 1.5F);
        Producto p2 = new Bebida("Coca-Cola", 18, 1.5F);
        Producto p3 = new Higiene("Shampoo Sedal", 19,
                new ContenidoProducto(500, UnidadMedida.MILILITRO));
        Producto p4 = new Fruta("Frutillas", 64, UnidadMedida.KILO);

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
    }

    public static String getProductoMasCaro(ArrayList<Producto> productos){
        Optional<String> prod = productos.stream()
                .max(Producto::compareTo)
                .map(Producto::getNombre);

        if (prod.isEmpty()){
            throw new ListaVaciaException("La lista de productos se encuentra vacia");
        }

        return prod.get();
    }

    public static String getProductoMasBarato(ArrayList<Producto> productos){
        Optional<String> prod = productos.stream()
                .min(Producto::compareTo)
                .map(Producto::getNombre);

        if (prod.isEmpty()){
            throw new ListaVaciaException("La lista de productos se encuentra vacia");
        }

        return prod.get();
    }
}
