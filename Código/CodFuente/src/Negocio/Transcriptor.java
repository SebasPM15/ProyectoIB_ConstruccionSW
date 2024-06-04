/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Transcriptor {
    private final Diccionario diccionario;

    public Transcriptor() {
        diccionario = new Diccionario();
    }

    public String transcribirEspBraille(String textoEsp) {
        return diccionario.transcribirEspBraille(textoEsp);
    }

    public BufferedImage generarSenalizacion(String textoBraille) {
        return generarImagenDesdeTexto(textoBraille);
    }

    public BufferedImage imprimirTextoEspejo(String textoBraille) {
        String textoEspejo = new StringBuilder(textoBraille).reverse().toString();
        return generarImagenDesdeTexto(textoEspejo);
    }

    private BufferedImage generarImagenDesdeTexto(String texto) {
        int ancho = 400;
        int alto = 100 + texto.length() * 20;
        BufferedImage imagen = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = imagen.createGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, ancho, alto);
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.PLAIN, 20));
        g2d.drawString(texto, 10, 50);
        g2d.dispose();
        return imagen;
    }
}
