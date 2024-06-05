/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodFuente;

import java.util.HashMap;
import java.util.Map;

public class TranscripcionEspBraille {
    private static final Map<Character, String> espBrailleMap = new HashMap<>();

    static {
        espBrailleMap.put('a', "⠁");
        espBrailleMap.put('b', "⠃");
        espBrailleMap.put('c', "⠉");
        espBrailleMap.put('d', "⠙");
        espBrailleMap.put('e', "⠑");
        espBrailleMap.put('f', "⠋");
        espBrailleMap.put('g', "⠛");
        espBrailleMap.put('h', "⠓");
        espBrailleMap.put('i', "⠊");
        espBrailleMap.put('j', "⠚");
        espBrailleMap.put('k', "⠅");
        espBrailleMap.put('l', "⠇");
        espBrailleMap.put('m', "⠍");
        espBrailleMap.put('n', "⠝");
        espBrailleMap.put('o', "⠕");
        espBrailleMap.put('p', "⠏");
        espBrailleMap.put('q', "⠟");
        espBrailleMap.put('r', "⠗");
        espBrailleMap.put('s', "⠎");
        espBrailleMap.put('t', "⠞");
        espBrailleMap.put('u', "⠥");
        espBrailleMap.put('v', "⠧");
        espBrailleMap.put('w', "⠺");
        espBrailleMap.put('x', "⠭");
        espBrailleMap.put('y', "⠽");
        espBrailleMap.put('z', "⠵");
        espBrailleMap.put('1', "⠼⠁");
        espBrailleMap.put('2', "⠼⠃");
        espBrailleMap.put('3', "⠼⠉");
        espBrailleMap.put('4', "⠼⠙");
        espBrailleMap.put('5', "⠼⠑");
        espBrailleMap.put('6', "⠼⠋");
        espBrailleMap.put('7', "⠼⠛");
        espBrailleMap.put('8', "⠼⠓");
        espBrailleMap.put('9', "⠼⠊");
        espBrailleMap.put('0', "⠼⠚");
        espBrailleMap.put('.', "⠲");
        espBrailleMap.put(',', "⠂");
        espBrailleMap.put('?', "⠦");
        espBrailleMap.put('!', "⠖");
        espBrailleMap.put(';', "⠆");
        espBrailleMap.put(':', "⠒");
        espBrailleMap.put('-', "⠤");
        espBrailleMap.put(' ', " ");
    }

    public String transcribir(String texto) {
        StringBuilder braille = new StringBuilder();
        for (char ch : texto.toLowerCase().toCharArray()) {
            braille.append(espBrailleMap.getOrDefault(ch, " "));
        }
        return braille.toString();
    }
}
