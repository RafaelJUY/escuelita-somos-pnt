package model;

public class Bebida extends Producto{
    private Float litros;

    public Bebida(String nombre, Integer precio, Float litros) {
        super(nombre, precio);
        this.litros = (litros > 0) ? litros : 0;
    }

    public Float getLitros() {
        return litros;
    }

    public void setLitros(Float litros) {
        this.litros = (litros > 0) ? litros : 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.getNombre()).append(" /// ")
                .append("Litros: ").append(this.getLitros()).append(" /// ")
                .append("Precio: $").append(this.getPrecio());
        return sb.toString();
    }
}
