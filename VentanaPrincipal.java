package view;

import controller.ControladorPaciente;
import controller.ControladorPersonalSalud;
import controller.ConexionBD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {
    private ConexionBD conexion;
    private ControladorPaciente controladorPaciente;
    private ControladorPersonalSalud controladorPersonalSalud;

    public VentanaPrincipal() {
        setTitle("Sistema de Gestión COVID-19");
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Inicializar la conexión y controladores
        conexion = new ConexionBD();
        controladorPaciente = new ControladorPaciente(conexion);
        controladorPersonalSalud = new ControladorPersonalSalud(conexion);

        JButton btnPaciente = new JButton("Registrar Paciente");
        JButton btnPersonal = new JButton("Registrar Personal de Salud");

        // Pasar el controlador adecuado al constructor correspondiente
        btnPaciente.addActionListener((ActionEvent e) -> {
            RegistroPaciente ventanaPaciente = new RegistroPaciente(controladorPaciente);
            ventanaPaciente.setVisible(true);
        });

        btnPersonal.addActionListener((ActionEvent e) -> {
            RegistroPersonalSalud ventanaPersonal = new RegistroPersonalSalud(controladorPersonalSalud);
            ventanaPersonal.setVisible(true);
        });

        add(btnPaciente);
        add(btnPersonal);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}
