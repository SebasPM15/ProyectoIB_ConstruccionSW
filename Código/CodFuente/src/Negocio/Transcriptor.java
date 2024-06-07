package Negocio;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * La clase Transcriptor proporciona métodos para traducir texto a Braille,
 * generar imágenes de Braille, y guardar dichas imágenes en archivos.
 * Esta clase utiliza un Diccionario para realizar la traducción entre
 * texto y Braille.
 * 
 */
public class Transcriptor {
    private final Diccionario diccionario;

    /**
     * Constructor de la clase Transcriptor.
     * Inicializa el diccionario utilizado para la traducción.
     */
    public Transcriptor() {
        diccionario = new Diccionario();
    }

    /**
     * Traduce el texto dado a Braille o de Braille a texto.
     * 
     * @param textoATraducir El texto que se desea traducir.
     * @return El texto traducido.
     */
    public String traducirTexto(String textoATraducir) {
        if (textoATraducir == null || textoATraducir.isEmpty()) {
            return "";
        }

        char primerCaracter = textoATraducir.charAt(0);
        int indiceIdioma = esBraille(primerCaracter) ? 0 : 1;

        return diccionario.traducirCaracterACaracter(textoATraducir, indiceIdioma);
    }

    /**
     * Determina si el carácter dado es un carácter Braille.
     * 
     * @param primerCaracter El carácter a evaluar.
     * @return true si el carácter es Braille, false en caso contrario.
     */
    public boolean esBraille(char primerCaracter) {
        return primerCaracter >= '\u2800' && primerCaracter <= '\u28FF';
    }

    /**
     * Genera una imagen de señalización a partir del texto en Braille dado.
     * 
     * @param textoBraille El texto en Braille para generar la señalización.
     * @return Una imagen que contiene la señalización en Braille.
     */
    public BufferedImage generarSenalizacion(String textoBraille) {
        return generarImagenDesdeTexto(textoBraille);
    }

    /**
     * Genera una imagen del texto en Braille en forma de espejo.
     * 
     * @param textoBraille El texto en Braille para generar la imagen de espejo.
     * @return Una imagen que contiene el texto en Braille en forma de espejo.
     */
    public BufferedImage imprimirTextoEspejo(String textoBraille) {
        String textoEspejo = new StringBuilder(textoBraille).reverse().toString();
        return generarImagenDesdeTexto(textoEspejo);
    }

    /**
     * Genera una imagen espejo de la imagen dada.
     * 
     * @param imagen La imagen original.
     * @return Una imagen que es el espejo de la imagen original.
     */
    public BufferedImage generarImagenEspejo(BufferedImage imagen) {
        int width = imagen.getWidth();
        int height = imagen.getHeight();
        BufferedImage imagenEspejo = new BufferedImage(width, height, imagen.getType());
        Graphics2D g = imagenEspejo.createGraphics();
        g.drawImage(imagen, width, 0, -width, height, null);
        g.dispose();
        return imagenEspejo;
    }

    /**
     * Genera una imagen desde el texto dado.
     * 
     * @param texto El texto para generar la imagen.
     * @return Una imagen que contiene el texto.
     */
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

    /**
     * Guarda la imagen dada en un archivo.
     * 
     * @param imagen La imagen a guardar.
     * @param nombreBase El nombre base del archivo.
     * @param texto_en_espejo_guardado_exitosamente El mensaje de éxito para mostrar.
     */
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
