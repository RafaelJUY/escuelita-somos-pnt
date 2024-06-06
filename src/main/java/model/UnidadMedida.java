package model;

public enum UnidadMedida {
    KILO("kilo", "kg"),
    MILILITRO("mililitro", "ml");
    private String nombre;
    private String abreviatura;
    private UnidadMedida(String nombre, String abreviatura){
        this.nombre = nombre;
        this.abreviatura = abreviatura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }
}
