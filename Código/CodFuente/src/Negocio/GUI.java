/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GUI {
    private boolean imagenSenalGuardada = false;
    private boolean imagenEspejoGuardada = false;
    private Transcriptor transcriptor;

    public GUI() {
        transcriptor = new Transcriptor();
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Transcripción Braille");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(12, 1, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTextField inputField = new JTextField();
        panel.add(new JLabel("Ingrese texto en español:"));
        panel.add(inputField);

        JButton transcribirButton = new JButton("Transcribir a Braille");
        panel.add(transcribirButton);

        panel.add(new JLabel("Texto en Braille:"));
        JTextArea outputArea = new JTextArea(5, 20);
        outputArea.setEditable(false);
        panel.add(new JScrollPane(outputArea));

        panel.add(new JLabel("Modo Espejo:"));
        JTextArea espejoArea = new JTextArea(5, 20);
        espejoArea.setEditable(false);
        panel.add(new JScrollPane(espejoArea));

        JButton guardarSenalButton = new JButton("Guardar Señalización Braille");
        panel.add(guardarSenalButton);

        JButton guardarEspejoButton = new JButton("Guardar Texto en Espejo");
        panel.add(guardarEspejoButton);

        JButton limpiarButton = new JButton("Limpiar Pantalla");
        panel.add(limpiarButton);

        JButton salirButton = new JButton("Salir");
        panel.add(salirButton);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

        transcribirButton.addActionListener(e -> {
            String textoEsp = inputField.getText();
            String textoBraille = transcriptor.transcribirEspBraille(textoEsp);
            outputArea.setText(textoBraille);

            String textoBrailleEspejo = new StringBuilder(textoBraille).reverse().toString();
            espejoArea.setText(textoBrailleEspejo);

            imagenSenalGuardada = false;
            imagenEspejoGuardada = false;
        });

        guardarSenalButton.addActionListener(e -> {
            if (imagenSenalGuardada) {
                JOptionPane.showMessageDialog(null, "Ya guardaste la imagen", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String textoBraille = outputArea.getText();
            BufferedImage senal = transcriptor.generarSenalizacion(textoBraille);
            guardarImagen(senal, "senal", "Señalización Braille guardada exitosamente.");
            imagenSenalGuardada = true;
        });

        guardarEspejoButton.addActionListener(e -> {
            if (imagenEspejoGuardada) {
                JOptionPane.showMessageDialog(null, "Ya guardaste la imagen", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String textoBraille = outputArea.getText();
            BufferedImage espejo = transcriptor.imprimirTextoEspejo(textoBraille);
            guardarImagen(espejo, "espejo", "Texto en Espejo guardado exitosamente.");
            imagenEspejoGuardada = true;
        });

        limpiarButton.addActionListener(e -> {
            inputField.setText("");
            outputArea.setText("");
            espejoArea.setText("");
        });

        salirButton.addActionListener(e -> {
            frame.dispose();
        });
    }

    private void guardarImagen(BufferedImage imagen, String nombreBase, String mensajeExito) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Imagen");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int seleccion = fileChooser.showSaveDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File carpeta = fileChooser.getSelectedFile();
            try {
                String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
                File archivo = new File(carpeta, nombreBase + "_" + timestamp + ".png");
                ImageIO.write(imagen, "png", archivo);
                JOptionPane.showMessageDialog(null, mensajeExito, "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar la imagen: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }
}
