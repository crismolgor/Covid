package view;

import controller.ControladorPaciente;
import model.Paciente;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class RegistroPaciente extends JFrame {
    private JTextField documentoField, nombreField, direccionField, telefonoField, 
                       fechaNacimientoField, lugarProcedenciaField;
    private JComboBox<String> generoCombo, estadoCombo;
    private JCheckBox tratamientoCasaCheck;
    private JButton guardarButton;
    private ControladorPaciente controlador;

    // Constructor
    public RegistroPaciente(ControladorPaciente controlador) {
        this.controlador = controlador;
        setTitle("Registro de Paciente");
        setSize(500, 400);
        setLayout(new GridLayout(10, 2));

        // Documento
        add(new JLabel("Documento:"));
        documentoField = new JTextField();
        add(documentoField);

        // Nombre
        add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        add(nombreField);

        // Dirección
        add(new JLabel("Dirección:"));
        direccionField = new JTextField();
        add(direccionField);

        // Teléfono
        add(new JLabel("Teléfono:"));
        telefonoField = new JTextField();
        add(telefonoField);

        // Fecha de nacimiento
        add(new JLabel("Fecha de Nacimiento (DD/MM/YYYY):"));
        fechaNacimientoField = new JTextField();
        add(fechaNacimientoField);

        // Género (Lista de selección)
        add(new JLabel("Género:"));
        String[] generos = {"Masculino", "Femenino"};
        generoCombo = new JComboBox<>(generos);
        add(generoCombo);

        // Lugar de procedencia (Campo de texto)
        add(new JLabel("Lugar de Procedencia:"));
        lugarProcedenciaField = new JTextField();
        add(lugarProcedenciaField);

        // Estado (Lista de selección)
        add(new JLabel("Estado:"));
        String[] estados = {"Sospechoso", "Positivo", "Negativo", "Recuperado", "Muerto"};
        estadoCombo = new JComboBox<>(estados);
        add(estadoCombo);

        // Tratamiento en Casa (Checkbox)
        add(new JLabel("Tratamiento en Casa:"));
        tratamientoCasaCheck = new JCheckBox();
        add(tratamientoCasaCheck);

        // Botón de Guardar
        guardarButton = new JButton("Guardar");
        guardarButton.addActionListener(e -> guardarPaciente());
        add(guardarButton);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    // Método para guardar el paciente
    private void guardarPaciente() {
        try {
            int documento = Integer.parseInt(documentoField.getText());
            String nombre = nombreField.getText();
            String direccion = direccionField.getText();
            String telefono = telefonoField.getText();
            Date fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimientoField.getText());
            String genero = (String) generoCombo.getSelectedItem();
            String lugarProcedencia = lugarProcedenciaField.getText();
            int estado = estadoCombo.getSelectedIndex() + 1; 
            boolean tratamientoCasa = tratamientoCasaCheck.isSelected();

            // Crear el objeto Paciente
            Paciente paciente = new Paciente(
                documento, nombre, direccion, telefono, genero, 
                fechaNacimiento, 0, new Date(), estado, 
                tratamientoCasa, 1 // Clínica predeterminada para este ejemplo
            );

            // Llamar al controlador para registrar el paciente
            controlador.registrarPaciente(paciente);
            JOptionPane.showMessageDialog(this, "Paciente registrado exitosamente.");
            dispose(); // Cerrar la ventana después de guardar
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Documento debe ser numérico.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Error: Fecha inválida. Use el formato DD/MM/YYYY.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
