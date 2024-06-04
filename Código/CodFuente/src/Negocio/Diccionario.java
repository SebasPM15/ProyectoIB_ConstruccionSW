/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    private final Map<Character, String> diccionarioBraille;

    public Diccionario() {
        diccionarioBraille = new HashMap<>();
        diccionarioBraille.put('a', "⠁");
        diccionarioBraille.put('b', "⠃");
        diccionarioBraille.put('c', "⠉");
        diccionarioBraille.put('d', "⠙");
        diccionarioBraille.put('e', "⠑");
        diccionarioBraille.put('f', "⠋");
        diccionarioBraille.put('g', "⠛");
        diccionarioBraille.put('h', "⠓");
        diccionarioBraille.put('i', "⠊");
        diccionarioBraille.put('j', "⠚");
        diccionarioBraille.put('k', "⠅");
        diccionarioBraille.put('l', "⠇");
        diccionarioBraille.put('m', "⠍");
        diccionarioBraille.put('n', "⠝");
        diccionarioBraille.put('o', "⠕");
        diccionarioBraille.put('p', "⠏");
        diccionarioBraille.put('q', "⠟");
        diccionarioBraille.put('r', "⠗");
        diccionarioBraille.put('s', "⠎");
        diccionarioBraille.put('t', "⠞");
        diccionarioBraille.put('u', "⠥");
        diccionarioBraille.put('v', "⠧");
        diccionarioBraille.put('w', "⠺");
        diccionarioBraille.put('x', "⠭");
        diccionarioBraille.put('y', "⠽");
        diccionarioBraille.put('z', "⠵");

        // Letras acentuadas
        diccionarioBraille.put('á', "⠷");
        diccionarioBraille.put('é', "⠮");
        diccionarioBraille.put('í', "⠌");
        diccionarioBraille.put('ó', "⠬");
        diccionarioBraille.put('ú', "⠾");

        // Números
        diccionarioBraille.put('1', "⠁");
        diccionarioBraille.put('2', "⠃");
        diccionarioBraille.put('3', "⠉");
        diccionarioBraille.put('4', "⠙");
        diccionarioBraille.put('5', "⠑");
        diccionarioBraille.put('6', "⠋");
        diccionarioBraille.put('7', "⠛");
        diccionarioBraille.put('8', "⠓");
        diccionarioBraille.put('9', "⠊");
        diccionarioBraille.put('0', "⠚");

        // Signos de puntuación
        diccionarioBraille.put('.', "⠲");
        diccionarioBraille.put(',', "⠂");
        diccionarioBraille.put(';', "⠆");
        diccionarioBraille.put(':', "⠒");
        diccionarioBraille.put('!', "⠖");
        diccionarioBraille.put('?', "⠦");
        diccionarioBraille.put('(', "⠶");
        diccionarioBraille.put(')', "⠶");
        diccionarioBraille.put('"', "⠦");
        diccionarioBraille.put('-', "⠤");
        diccionarioBraille.put('\'', "⠄");
        diccionarioBraille.put('/', "⠌");
        diccionarioBraille.put(' ', "   ");
    }

    public String transcribirEspBraille(String texto) {
StringBuilder braille = new StringBuilder();
        boolean esNumeroAnterior = false; // Para controlar la inserción del prefijo numérico

        for (int i = 0; i < texto.length(); i++) {
            char ch = texto.charAt(i);

            if (Character.isUpperCase(ch)) {
               braille.append("⠨");
            }

            if (Character.isDigit(ch)) {
                if (!esNumeroAnterior) {
                    braille.append("⠼"); // Añadir el prefijo numérico al inicio de una secuencia de números
                    esNumeroAnterior = true;
                }
            } else {
                esNumeroAnterior = false; // Resetear cuando ya no es un dígito
            }

            braille.append(diccionarioBraille.getOrDefault(Character.toLowerCase(ch), " ")); // Añadir la traducción de braille en minúsculas
        }

        return braille.toString();
    }
}
