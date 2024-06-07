/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Negocio.Transcriptor;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Ventana de la interfaz gráfica para traducir texto de Braille a Español.
 * Esta clase proporciona una interfaz gráfica de usuario (GUI) para que el usuario
 * pueda introducir texto en Braille y traducirlo a Español.
 * Utiliza un arreglo de botones para representar los puntos del sistema Braille
 * y proporciona funcionalidad para traducir el texto introducido al Español.
 * Además, muestra un diccionario Braille-Español para referencia del usuario.
 * 
 */
public class BrailleEsp extends javax.swing.JFrame {

    private boolean[] puntosPresionados;
    JButton[] puntos;
    private Transcriptor transcriptor;

    /**
     * Constructor de la clase BrailleEsp.
     * Inicializa la interfaz gráfica y las variables necesarias.
     */    
    public BrailleEsp() {
        initComponents();
        puntosPresionados = new boolean[6];
        transcriptor = new Transcriptor();
        setTitle("Traducir de Braille a Español");
        crearArregloPuntos(); // Llama al método para inicializar el arreglo puntos
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        jB1 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTABraille = new javax.swing.JTextArea();
        jBTraducir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAEsp = new javax.swing.JTextArea();
        jBLimpiar = new javax.swing.JButton();
        jBRegresar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBLGenCar = new javax.swing.JButton();
        jBEspacio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Establecer el color de fondo del panel a blanco
        jPanel.setBackground(java.awt.Color.WHITE);
        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLayout.createSequentialGroup()
                            .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTABraille.setEditable(false);
        jTABraille.setBackground(new java.awt.Color(255, 255, 255));
        jTABraille.setColumns(20);
        jTABraille.setRows(5);
        jTABraille.setBorder(javax.swing.BorderFactory.createTitledBorder("Texto en Braille"));
        jScrollPane1.setViewportView(jTABraille);

        jBTraducir.setText("Traducir");
        jBTraducir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jBTraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTraducirActionPerformed(evt);
            }
        });

        jTAEsp.setEditable(false);
        jTAEsp.setBackground(new java.awt.Color(255, 255, 255));
        jTAEsp.setColumns(20);
        jTAEsp.setRows(5);
        jTAEsp.setBorder(javax.swing.BorderFactory.createTitledBorder("Texto traducido"));
        jScrollPane2.setViewportView(jTAEsp);

        jBLimpiar.setText("Limpiar Pantalla");
        jBLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBRegresar.setText("Regresar");
        jBRegresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {
                {"⠁", "a", "⠃", "b"},
                {"⠉", "c", "⠙", "d"},
                {"⠑", "e", "⠋", "f"},
                {"⠛", "g", "⠓", "h"},
                {"⠊", "i", "⠚", "j"},
                {"⠅", "k", "⠇", "l"},
                {"⠍", "m", "⠝", "n"},
                {"⠻", "ñ", "⠕", "o"},
                {"⠏", "p", "⠟", "q"},
                {"⠗", "r", "⠎", "s"},
                {"⠞", "t", "⠥", "u"},
                {"⠧", "v", "⠺", "w"},
                {"⠭", "x", "⠽", "y"},
                {"⠵", "z", "⠲", "."},
                {"⠂", ",", "⠦", "?"},
                {"⠖", "!", "⠆", ";"},
                {"⠒", ":", "⠤", "-"},
                {" ", " ", "⠷", "á"},
                {"⠿", "é", "⠽", "í"},
                {"⠾", "ó", "⠷", "ú"},
                {"⠳", "ü", "⠈", "@"},
                {"⠨⠁", "A", "⠨⠃", "B"},
                {"⠨⠉", "C", "⠨⠙", "D"},
                {"⠨⠑", "E", "⠨⠋", "F"},
                {"⠨⠛", "G", "⠨⠓", "H"},
                {"⠨⠊", "I", "⠨⠚", "J"},
                {"⠨⠅", "K", "⠨⠇", "L"},
                {"⠨⠍", "M", "⠨⠝", "N"},
                {"⠨⠻", "Ñ", "⠨⠕", "O"},
                {"⠨⠏", "P", "⠨⠟", "Q"},
                {"⠨⠗", "R", "⠨⠎", "S"},
                {"⠨⠞", "T", "⠨⠥", "U"},
                {"⠨⠧", "V", "⠨⠺", "W"},
                {"⠨⠭", "X", "⠨⠽", "Y"},
                {"⠨⠵", "Z"},
                {"⠼⠁", "1", "⠼⠃", "2"},
                {"⠼⠉", "3", "⠼⠙", "4"},
                {"⠼⠑", "5", "⠼⠋", "6"},
                {"⠼⠛", "7", "⠼⠓", "8"},
                {"⠼⠊", "9", "⠼⠚", "0"}
            },
            new String [] {
                "Símbolo Braille", "Letra", "Símbolo Braille", "Letra"
            }
        ));
        jScrollPane4.setViewportView(jTable1);
        // Desactivar el ajuste automático del tamaño de las columnas
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel1.setText("Diccionario para recordar :)");

        jBLGenCar.setText("Generar Caracter");
        jBLGenCar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jBLGenCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLGenCarActionPerformed(evt);
            }
        });

        jBEspacio.setBackground(new java.awt.Color(0, 0, 0));
        jBEspacio.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jBEspacio.setForeground(new java.awt.Color(255, 255, 255));
        jBEspacio.setText("SPACE");
        jBEspacio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jBEspacio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBEspacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEspacioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBEspacio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBLGenCar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                .addComponent(jScrollPane2))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBTraducir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTraducir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEspacio))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBLGenCar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método para manejar el evento de clic en el botón "Regresar".
     * Cierra la ventana actual.
     * 
     * @param evt El evento de acción que desencadena el método.
     */    
    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBRegresarActionPerformed

    /**
    * Método para manejar el evento de clic en el botón "Limpiar Pantalla".
    * Limpia los campos de texto y reinicia los botones a su estado inicial.
    * 
    * @param evt El evento de acción que desencadena el método.
    */
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jTAEsp.setText("");
        jTABraille.setText("");
        reiniciarBotones();

    }//GEN-LAST:event_jBLimpiarActionPerformed

    /**
     * Método para manejar el evento de clic en el botón "Traducir".
     * Traduce el texto en Braille al Español y muestra el resultado.
     * 
     * @param evt El evento de acción que desencadena el método.
     */    
    private void jBTraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTraducirActionPerformed
        // Traducir el texto al Español
        String textoBraille = jTABraille.getText();
        String textoEsp = transcriptor.traducirTexto(textoBraille);
        jTAEsp.setText(textoEsp);
        reiniciarBotones();
    }//GEN-LAST:event_jBTraducirActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed

    }//GEN-LAST:event_jB3ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed

    }//GEN-LAST:event_jB6ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed

    }//GEN-LAST:event_jB2ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed

    }//GEN-LAST:event_jB5ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed

    }//GEN-LAST:event_jB4ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed

    }//GEN-LAST:event_jB1ActionPerformed

    /**
     * Método para manejar el evento de clic en el botón "Generar Caracter".
     * Convierte los puntos Braille presionados en un carácter y lo agrega al área de texto.
     * 
     * @param evt El evento de acción que desencadena el método.
     */    
    private void jBLGenCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLGenCarActionPerformed
        Character brailleChar = convertirABraille(puntosPresionados);
        if (brailleChar != null) {
            jTABraille.append(Character.toString(brailleChar));
        } else {
            // Mostrar mensaje de advertencia si el carácter no es válido
            JOptionPane.showMessageDialog(null, "Caracter no válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        reiniciarBotones();        
    }//GEN-LAST:event_jBLGenCarActionPerformed

    /**
     * Método para manejar el evento de clic en el botón "SPACE".
     * Agrega un espacio al área de texto de Braille.
     * 
     * @param evt El evento de acción que desencadena el método.
     */    
    private void jBEspacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEspacioActionPerformed
        // Agregar un espacio al área de texto de Braille
        jTABraille.append(" ");
    }//GEN-LAST:event_jBEspacioActionPerformed
    
    /**
    * Método para inicializar el arreglo de botones que representan los puntos del sistema Braille.
    * Asigna los botones a sus respectivos elementos en el arreglo y configura los listeners de acción.
    */
    private void crearArregloPuntos() {
        puntos = new JButton[]{jB1, jB4, jB2, jB5, jB3, jB6};

        for (int i = 0; i < puntos.length; i++) {
            int finalI = i;
            puntos[i].addActionListener(e -> {
                puntosPresionados[finalI] = !puntosPresionados[finalI];
                puntos[finalI].setBackground(puntosPresionados[finalI] ? Color.BLACK : Color.WHITE);
                char brailleChar = convertirABraille(puntosPresionados);
                System.out.println(brailleChar); // Imprimir el caracter Braille
            });
        }
    }

    /**
     * Método para reiniciar el estado de los botones a su estado inicial (sin puntos presionados).
     */
    private void reiniciarBotones() {
        for (int i = 0; i < puntos.length; i++) {
            puntosPresionados[i] = false;
            puntos[i].setBackground(Color.WHITE);
        }
    }

    /**
     * Método para convertir el estado de los puntos Braille presionados en un carácter Braille.
     * Utiliza un mapa para asociar los patrones Braille con los caracteres correspondientes.
     * 
     * @param puntosPresionados El arreglo que representa el estado de los puntos Braille.
     * @return El carácter Braille correspondiente al patrón de puntos presionados, o null si no hay una correspondencia.
     */
    private Character convertirABraille(boolean[] puntosPresionados) {
        // Mapea la representación binaria a caracteres Braille
        StringBuilder braillePattern = new StringBuilder();
        // La representación del patrón Braille sigue el orden: 1, 4, 2, 5, 3, 6
        for (int i = 0; i < puntosPresionados.length; i++) {
            braillePattern.append(puntosPresionados[i] ? "1" : "0");
        }

        // Mapa de algunos patrones Braille comunes
        Map<String, Character> brailleMap = new HashMap<>();
        // Indicador de mayúscula
        brailleMap.put("010001", '⠨'); // Indicador de mayúscula
        //Letras 
        brailleMap.put("100000", '⠁'); // a
        brailleMap.put("101000", '⠃'); // b
        brailleMap.put("110000", '⠉'); // c
        brailleMap.put("110100", '⠙'); // d
        brailleMap.put("100100", '⠑'); // e
        brailleMap.put("111000", '⠋'); // f
        brailleMap.put("111100", '⠛'); // g
        brailleMap.put("101100", '⠓'); // h
        brailleMap.put("011000", '⠊'); // i
        brailleMap.put("011100", '⠚'); // j
        brailleMap.put("100010", '⠅'); // k
        brailleMap.put("101010", '⠇'); // l
        brailleMap.put("110010", '⠍'); // m
        brailleMap.put("110110", '⠝'); // n
        brailleMap.put("100110", '⠕'); // o
        brailleMap.put("111010", '⠏'); // p
        brailleMap.put("111110", '⠟'); // q
        brailleMap.put("101110", '⠗'); // r
        brailleMap.put("011010", '⠎'); // s
        brailleMap.put("011110", '⠞'); // t
        brailleMap.put("100011", '⠥'); // u
        brailleMap.put("101011", '⠧'); // v
        brailleMap.put("011101", '⠺'); // w
        brailleMap.put("110011", '⠭'); // x
        brailleMap.put("110111", '⠽'); // y
        brailleMap.put("100111", '⠵'); // z
        // Números (requieren el prefijo de número ⠼ que es 3456)
        brailleMap.put("010111", '⠼'); // Prefijo número
        brailleMap.put("100000", '⠁'); // 1
        brailleMap.put("101000", '⠃'); // 2
        brailleMap.put("110000", '⠉'); // 3
        brailleMap.put("110100", '⠙'); // 4
        brailleMap.put("100100", '⠑'); // 5
        brailleMap.put("111000", '⠋'); // 6
        brailleMap.put("111100", '⠛'); // 7
        brailleMap.put("101100", '⠓'); // 8
        brailleMap.put("011000", '⠊'); // 9
        brailleMap.put("011100", '⠚'); // 0
        // Signos de puntuación
        brailleMap.put("001000", '⠂'); // Coma
        brailleMap.put("001010", '⠆'); // Punto y coma
        brailleMap.put("001101", '⠲'); // Punto
        brailleMap.put("001110", '⠖'); // Signo de exclamación
        brailleMap.put("001011", '⠦'); // Signo de interrogación
        brailleMap.put("001100", '⠒'); // Signo de 2 puntos
        
        // Otros símbolos
        brailleMap.put("010110", '⠤'); // Guion medio
        brailleMap.put("010000", '⠈'); // @ (arroba)
        //Otros símbolos
        brailleMap.put("101111", '⠷'); // á
        brailleMap.put("111111", '⠿'); // é
        brailleMap.put("010010", '⠌'); // í
        brailleMap.put("011111", '⠾'); // ó
        brailleMap.put("010110", '⠜'); // ú
        brailleMap.put("101101", '⠳'); // ü
        
        // Obtener el carácter Braille correspondiente al patrón
        return brailleMap.getOrDefault(braillePattern.toString(), null);
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BrailleEsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrailleEsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrailleEsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrailleEsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new BrailleEsp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jBEspacio;
    private javax.swing.JButton jBLGenCar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JButton jBTraducir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTABraille;
    private javax.swing.JTextArea jTAEsp;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
