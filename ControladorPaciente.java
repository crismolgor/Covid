package controller;
import model.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorPaciente {
    private ConexionBD conexion;

    public ControladorPaciente(ConexionBD conexion) {
        this.conexion = conexion;
    }

    public void registrarPaciente(Paciente paciente) {
        String sql = "INSERT INTO paciente (nombre, direccion, telefono, genero, fechaNacimiento, "
                   + "lugarProcedencia, fechaDeteccion, estado, casa, clinica) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.getConnection().prepareStatement(sql)) {
            stmt.setString(1, paciente.getNombre());
            stmt.setString(2, paciente.getDireccion());
            stmt.setString(3, paciente.getTelefono());
            stmt.setString(4, paciente.getGenero());
            stmt.setDate(5, new java.sql.Date(paciente.getFechaNacimiento().getTime()));
            stmt.setInt(6, paciente.getLugarProcedencia());
            stmt.setDate(7, new java.sql.Date(paciente.getFechaDeteccion().getTime()));
            stmt.setInt(8, paciente.getEstado());
            stmt.setBoolean(9, paciente.isEnCasa());
            stmt.setInt(10, paciente.getClinica());

            stmt.executeUpdate();
            System.out.println("Paciente registrado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
