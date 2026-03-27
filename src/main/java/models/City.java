package models;

public class City {
    private String nombre;
    private String descripcion;
    private String code;

    public City() {}

    public City(String nombre, String descripcion, String code) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Datos de la ciudad \n"
                + "Nombre: " + this.getNombre()
                + "\nDescripcion: " + this.getDescripcion()
                + "\nCodigo: " + this.getCode()
                + "\n =======================================\n";
    }
}
