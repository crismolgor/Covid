package model;

public class Estado {
    private int id;
    private String descripcion;

    public Estado(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
