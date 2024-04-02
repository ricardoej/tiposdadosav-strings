package br.edu.univas.stringmanipulator;

import java.util.Arrays;

public class StringManipulator {

    public int getNumeroVogais(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public int getNumeroConsoantes(String str) {
        int count = 0;
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (char c : str.toCharArray()) {
            if (consonants.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public boolean getIsAnagrama(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}