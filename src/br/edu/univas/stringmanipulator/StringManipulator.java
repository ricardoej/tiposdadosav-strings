package br.edu.univas.stringmanipulator;

import java.util.Arrays;

public class StringManipulator {

    public int getNumeroVogais(String str) {
        int contar = 0;
        String vogal = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vogal.indexOf(c) != -1) {
                contar++;
            }
        }
        return contar;
    }

    public int getNumeroConsoantes(String str) {
        int contar = 0;
        String consoante = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (char c : str.toCharArray()) {
            if (consoante.indexOf(c) != -1) {
                contar++;
            }
        }
        return contar;
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