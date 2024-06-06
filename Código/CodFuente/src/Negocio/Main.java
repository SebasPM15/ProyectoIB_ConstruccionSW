/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Negocio;

import GUI.MENU;

/**
 * Clase principal que contiene el método main para iniciar la aplicación.
 */
public class Main {
    /**
     * Método principal que inicia la aplicación.
     * Crea una instancia del menú principal y lo hace visible.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */    
    public static void main(String[] args) {
        MENU menu = new MENU();
        menu.setVisible(true);
    }

}
