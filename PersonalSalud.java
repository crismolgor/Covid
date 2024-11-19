package model;

public class PersonalSalud {
    private int id;
    private int especialidad;
    private int clinica;

    public PersonalSalud(int id, int especialidad, int clinica) {
        this.id = id;
        this.especialidad = especialidad;
        this.clinica = clinica;
    }

    public int getId() { return id; }
    public int getEspecialidad() { return especialidad; }
    public void setEspecialidad(int especialidad) { this.especialidad = especialidad; }

    public int getClinica() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
