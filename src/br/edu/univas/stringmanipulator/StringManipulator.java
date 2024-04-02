package br.edu.univas.stringmanipulator;

import java.util.Arrays;

public class StringManipulator {

    public int getNumeroVogais(String texto) {
        int contVogais = 0;
        String vogal = "aeiouAEIOU";
        for (char c : texto.toCharArray()) {
            if (vogal.indexOf(c) != -1) {
                contVogais++;
            }
        }
        return contVogais;
    }

    public int getNumeroConsoantes(String texto) {
        int contConsoantes = 0;
        String consoante = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (char c : texto.toCharArray()) {
            if (consoante.indexOf(c) != -1) {
                contConsoantes++;
            }
        }
        return contConsoantes;
    }

    public boolean getIsAnagrama(String texto1, String texto2) {
        if (texto1.length() != texto2.length()) {
            return false;
        }

        char[] arr1 = texto1.toLowerCase().toCharArray();
        char[] arr2 = texto2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}