package br.edu.univas.stringmanipulator;

import java.util.Arrays;

public class StringManipulator {

    public int getNumeroVogais(String valor) {
        int vogais = 0;
        for (int i = 0; i < valor.length(); i++) {

            if (valor.charAt(i) == 'A' || valor.charAt(i) == 'a' || valor.charAt(i) == 'e' || valor.charAt(i) == 'E' || valor.charAt(i) == 'i' || valor.charAt(i) == 'I' || valor.charAt(i) == 'o' || valor.charAt(i) == 'O' || valor.charAt(i) == 'u' || valor.charAt(i) == 'U') {
                vogais++;
            }

        }
        return vogais;
    }

    public int getNumeroConsoantes(String valor) {
        int consoantes = 0;
        
        for (int i = 0; i < valor.length(); i++) {

            if (valor.charAt(i)>=65 && valor.charAt(i)<=122 && valor.charAt(i) != 'A' && valor.charAt(i) != 'a' && valor.charAt(i) != 'e' && valor.charAt(i) != 'E' && valor.charAt(i) != 'i' && valor.charAt(i) != 'I' && valor.charAt(i) != 'o' && valor.charAt(i) != 'O' && valor.charAt(i) != 'u' && valor.charAt(i) != 'U') {
                consoantes++;
            }

        }
        return consoantes;
    }

    

	public boolean getIsAnagrama(String string, String string2) {
	
		if (string.length() != string2.length()) {
             return false;
         }

       char[] Array1 = string.toCharArray();
         char[] Array2 = string2.toCharArray();
        Arrays.sort(Array1);
         Arrays.sort(Array2);
         return Arrays.equals(Array1, Array2);

         
     }
     
 
}


