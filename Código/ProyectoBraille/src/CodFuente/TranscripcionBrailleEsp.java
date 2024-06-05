/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodFuente;

import java.util.HashMap;
import java.util.Map;

public class TranscripcionBrailleEsp {
    private static final Map<String, Character> brailleEspMap = new HashMap<>();

    static {
        brailleEspMap.put("⠁", 'a');
        brailleEspMap.put("⠃", 'b');
        brailleEspMap.put("⠉", 'c');
        brailleEspMap.put("⠙", 'd');
        brailleEspMap.put("⠑", 'e');
        brailleEspMap.put("⠋", 'f');
        brailleEspMap.put("⠛", 'g');
        brailleEspMap.put("⠓", 'h');
        brailleEspMap.put("⠊", 'i');
        brailleEspMap.put("⠚", 'j');
        brailleEspMap.put("⠅", 'k');
        brailleEspMap.put("⠇", 'l');
        brailleEspMap.put("⠍", 'm');
        brailleEspMap.put("⠝", 'n');
        brailleEspMap.put("⠕", 'o');
        brailleEspMap.put("⠏", 'p');
        brailleEspMap.put("⠟", 'q');
        brailleEspMap.put("⠗", 'r');
        brailleEspMap.put("⠎", 's');
        brailleEspMap.put("⠞", 't');
        brailleEspMap.put("⠥", 'u');
        brailleEspMap.put("⠧", 'v');
        brailleEspMap.put("⠺", 'w');
        brailleEspMap.put("⠭", 'x');
        brailleEspMap.put("⠽", 'y');
        brailleEspMap.put("⠵", 'z');
        brailleEspMap.put("⠼⠁", '1');
        brailleEspMap.put("⠼⠃", '2');
        brailleEspMap.put("⠼⠉", '3');
        brailleEspMap.put("⠼⠙", '4');
        brailleEspMap.put("⠼⠑", '5');
        brailleEspMap.put("⠼⠋", '6');
        brailleEspMap.put("⠼⠛", '7');
        brailleEspMap.put("⠼⠓", '8');
        brailleEspMap.put("⠼⠊", '9');
        brailleEspMap.put("⠼⠚", '0');
        brailleEspMap.put("⠲", '.');
        brailleEspMap.put("⠂", ',');
        brailleEspMap.put("⠦", '?');
        brailleEspMap.put("⠖", '!');
        brailleEspMap.put("⠆", ';');
        brailleEspMap.put("⠒", ':');
        brailleEspMap.put("⠤", '-');
        brailleEspMap.put(" ", ' ');
    }

    public String transcribir(String textoBraille) {
        StringBuilder espanol = new StringBuilder();
        for (int i = 0; i < textoBraille.length(); i++) {
            if (textoBraille.charAt(i) == '⠼') {
                espanol.append(brailleEspMap.getOrDefault(textoBraille.substring(i, i + 2), ' '));
                i++;
            } else {
                espanol.append(brailleEspMap.getOrDefault(String.valueOf(textoBraille.charAt(i)), ' '));
            }
        }
        return espanol.toString();
    }
}
