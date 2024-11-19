package view;

import controller.ControladorPersonalSalud;
import model.PersonalSalud;

import javax.swing.*;
import java.awt.*;

public class RegistroPersonalSalud extends JFrame {
    private JTextField especialidadField, clinicaField;
    private JButton guardarButton;
    private ControladorPersonalSalud controlador;

    public RegistroPersonalSalud(ControladorPersonalSalud controlador) {
        this.controlador = controlador;
        setTitle("Registro de Personal de Salud");
        setSize(400, 200);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Especialidad:"));
        especialidadField = new JTextField();
        add(especialidadField);

        add(new JLabel("Clínica:"));
        clinicaField = new JTextField();
        add(clinicaField);

        guardarButton = new JButton("Guardar");
        guardarButton.addActionListener(e -> {
            PersonalSalud personal = new PersonalSalud(
                0, Integer.parseInt(especialidadField.getText()), 
                Integer.parseInt(clinicaField.getText())
            );
            controlador.registrarPersonalSalud(personal);
        });

        add(guardarButton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
