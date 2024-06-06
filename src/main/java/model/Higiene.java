package model;

public class Higiene extends Producto{
    private ContenidoProducto contenido;

    public Higiene(String nombre, Integer precio, ContenidoProducto contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido.toString();
    }

    public void setContenido(ContenidoProducto contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.getNombre()).append(" /// ")
                .append("Contenido: ").append(this.getContenido()).append(" /// ")
                .append("Precio: $").append(this.getPrecio());
        return sb.toString();
    }
}
