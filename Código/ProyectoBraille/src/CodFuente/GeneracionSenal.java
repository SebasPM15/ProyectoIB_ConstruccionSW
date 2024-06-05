/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodFuente;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GeneracionSenal {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 100;

    public BufferedImage generarSenal(String texto) {
        BufferedImage imagen = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = imagen.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, WIDTH, HEIGHT);
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Braille", Font.PLAIN, 40));
        g2d.drawString(texto, 10, 50);
        g2d.dispose();
        return imagen;
    }
}
