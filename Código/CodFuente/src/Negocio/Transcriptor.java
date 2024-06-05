package Negocio;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Transcriptor {
    private final Diccionario diccionario;

    public Transcriptor() {
        diccionario = new Diccionario();
    }

    public String traducirTexto(String textoATraducir) {
        if (textoATraducir == null || textoATraducir.isEmpty()) {
            return "";
        }

        char primerCaracter = textoATraducir.charAt(0);
        int indiceIdioma = esBraille(primerCaracter) ? 0 : 1;

        return diccionario.traducirCaracterACaracter(textoATraducir, indiceIdioma);
    }

    public boolean esBraille(char primerCaracter) {
        return primerCaracter >= '\u2800' && primerCaracter <= '\u28FF';
    }

    public BufferedImage generarSenalizacion(String textoBraille) {
        return generarImagenDesdeTexto(textoBraille);
    }

    public BufferedImage imprimirTextoEspejo(String textoBraille) {
        String textoEspejo = new StringBuilder(textoBraille).reverse().toString();
        return generarImagenDesdeTexto(textoEspejo);
    }

    public BufferedImage generarImagenEspejo(BufferedImage imagen) {
        int width = imagen.getWidth();
        int height = imagen.getHeight();
        BufferedImage imagenEspejo = new BufferedImage(width, height, imagen.getType());
        Graphics2D g = imagenEspejo.createGraphics();
        g.drawImage(imagen, width, 0, -width, height, null);
        g.dispose();
        return imagenEspejo;
    }
    
    private BufferedImage generarImagenDesdeTexto(String texto) {
        String[] lineas = texto.split("\n");
        int ancho = 400;
        int alto = 100 + lineas.length * 30; // Ajuste de altura según las líneas
        BufferedImage imagen = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = imagen.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, ancho, alto);
        g2d.setColor(Color.BLACK);
        // Utiliza una fuente que soporte caracteres Braille
        g2d.setFont(new Font("Arial Unicode MS", Font.PLAIN, 20));
        FontMetrics fm = g2d.getFontMetrics();
        int y = 50;
        for (String linea : lineas) {
            g2d.drawString(linea, 10, y + fm.getAscent());
            y += fm.getHeight();
        }
        g2d.dispose();
        return imagen;
    }

    public void guardarImagen(BufferedImage imagen, String nombreBase, String texto_en_espejo_guardado_exitosamente) {
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
                JOptionPane.showMessageDialog(null, texto_en_espejo_guardado_exitosamente, "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar la imagen: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }
}
