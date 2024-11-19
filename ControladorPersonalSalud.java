package controller;
import model.PersonalSalud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorPersonalSalud {
    private ConexionBD conexion;

    public ControladorPersonalSalud(ConexionBD conexion) {
        this.conexion = conexion;
    }

    public void registrarPersonal(PersonalSalud personal) {
        String sql = "INSERT INTO personalsalud (id, especialidad, clinica) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexion.getConnection().prepareStatement(sql)) {
            stmt.setInt(1, personal.getId());
            stmt.setInt(2, personal.getEspecialidad());
            stmt.setInt(3, personal.getClinica());
            stmt.executeUpdate();
            System.out.println("Personal de salud registrado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registrarPersonalSalud(PersonalSalud personal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
