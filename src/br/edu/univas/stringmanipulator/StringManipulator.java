package br.edu.univas.stringmanipulator;

import java.util.Arrays;

public class StringManipulator {

    public int getNumeroVogais(String string) {
        int contaVogais = 0;
        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contaVogais++;
            }
        }

        return contaVogais;
    }

    public int getNumeroConsoantes(String string) {
        int contaConsoantes = 0;
        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c >= 'a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                contaConsoantes++;
            }
        }

        return contaConsoantes;
    }

    public boolean getIsAnagrama(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        return Arrays.equals(str1Array, str2Array);
    }
}