package model;

public class ContenidoProducto {
    private Integer cantidad;
    private UnidadMedida unidadMedida;

    public ContenidoProducto(Integer cantidad, UnidadMedida unidadMedida) {
        this.cantidad = (cantidad > 0) ? cantidad : 0;
        this.unidadMedida = unidadMedida;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = (cantidad > 0) ? cantidad : 0;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getCantidad())
                .append(this.getUnidadMedida().getAbreviatura());
        return sb.toString();

    }
}
