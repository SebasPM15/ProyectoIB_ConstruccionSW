/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodFuente;

import java.awt.image.BufferedImage;

public class Usuario {
    private TranscripcionEspBraille transcripcionEspBraille;
    private TranscripcionBrailleEsp transcripcionBrailleEsp;
    private GeneracionSenal generacionSenal;
    private ImpresionEspejo impresionEspejo;

    public Usuario() {
        this.transcripcionEspBraille = new TranscripcionEspBraille();
        this.transcripcionBrailleEsp = new TranscripcionBrailleEsp();
        this.generacionSenal = new GeneracionSenal();
        this.impresionEspejo = new ImpresionEspejo();
    }

    public String transcribirEspBraille(String texto) {
        return transcripcionEspBraille.transcribir(texto);
    }

    public String transcribirBrailleEsp(String textoBraille) {
        return transcripcionBrailleEsp.transcribir(textoBraille);
    }

    public BufferedImage generarSenalizacion(String texto) {
        return generacionSenal.generarSenal(texto);
    }

    public BufferedImage imprimirTextoEspejo(String texto) {
        return impresionEspejo.imprimirEnEspejo(texto);
    }
}
