package model;
import java.util.Date;

public class Paciente {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String genero;
    private Date fechaNacimiento;
    private int lugarProcedencia;
    private Date fechaDeteccion;
    private int estado;
    private boolean enCasa;
    private int clinica;

    // Constructor
    public Paciente(int id, String nombre, String direccion, String telefono, String genero,
                    Date fechaNacimiento, int lugarProcedencia, Date fechaDeteccion,
                    int estado, boolean enCasa, int clinica) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarProcedencia = lugarProcedencia;
        this.fechaDeteccion = fechaDeteccion;
        this.estado = estado;
        this.enCasa = enCasa;
        this.clinica = clinica;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public int getLugarProcedencia() { return lugarProcedencia; }
    public void setLugarProcedencia(int lugarProcedencia) { this.lugarProcedencia = lugarProcedencia; }

    public Date getFechaDeteccion() { return fechaDeteccion; }
    public void setFechaDeteccion(Date fechaDeteccion) { this.fechaDeteccion = fechaDeteccion; }

    public int getEstado() { return estado; }
    public void setEstado(int estado) { this.estado = estado; }

    public boolean isEnCasa() { return enCasa; }
    public void setEnCasa(boolean enCasa) { this.enCasa = enCasa; }

    public int getClinica() { return clinica; }
    public void setClinica(int clinica) { this.clinica = clinica; }
}
