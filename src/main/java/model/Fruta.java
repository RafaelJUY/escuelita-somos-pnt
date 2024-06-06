package model;

public class Fruta extends Producto{
    private UnidadMedida unidadVenta;

    public Fruta(String nombre, Integer precio, UnidadMedida unidadVenta) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }

    public UnidadMedida getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(UnidadMedida unidadVenta) {
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.getNombre()).append(" /// ")
                .append("Precio: $").append(this.getPrecio()).append(" /// ")
                .append("Unidad de Venta: ").append(this.getUnidadVenta().getNombre());
        return sb.toString();
    }
}
