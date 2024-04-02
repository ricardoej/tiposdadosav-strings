package br.edu.univas.stringmanipulator;

public class StringManipulator {
    public int getNumeroVogais(String texto) {
        int contadorVogais = 0;
       // texto = texto.toLowerCase();
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (vogais.indexOf(caractere) != -1) {
                contadorVogais++;
            }
        }
        return contadorVogais;
    }
    public int getNumeroConsoantes(String texto) {
        int contadorConsoantes = 0;
        String consoantes = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (consoantes.indexOf(caractere) != -1) {
                contadorConsoantes++;
            }
        }
        return contadorConsoantes;
    }
    public static void main1(String[] args) {
        StringManipulator stringManipulator = new StringManipulator();
        String texto = "O sol brilha hoje.";
        int vogais = stringManipulator.getNumeroVogais(texto);
        int consoantes = stringManipulator.getNumeroConsoantes(texto);
    }
    
    public static void main2(String[] args) {
        StringManipulator stringManipulator = new StringManipulator();
        String texto = "As montanhas erguem-se majestosas sob o ceu estrelado.";
        int vogais = stringManipulator.getNumeroVogais(texto);
        int consoantes = stringManipulator.getNumeroConsoantes(texto);
    }
    
    public static void main3(String[] args) {
        StringManipulator stringManipulator = new StringManipulator();
        String texto = "A noite tranquila embala os sonhos da humanidade adormecida.";
        int vogais = stringManipulator.getNumeroVogais(texto);
        int consoantes = stringManipulator.getNumeroConsoantes(texto);
   
    }
        public boolean getIsAnagrama(String palavra1, String palavra2) {
            // Remove espaços e converte para minúsculas para comparação precisa
            palavra1 = palavra1.replaceAll("\\s", "").toLowerCase();
            palavra2 = palavra2.replaceAll("\\s", "").toLowerCase();

            // Verifica se os comprimentos são iguais
            if (palavra1.length() != palavra2.length()) {
                return false;
            }

            // Cria arrays de frequência de caracteres
            int[] frequencia1 = new int[26];
            int[] frequencia2 = new int[26];

            // Atualiza as frequências para cada caractere na palavra1
            for (char c : palavra1.toCharArray()) {
                frequencia1[c - 'a']++;
            }

            // Atualiza as frequências para cada caractere na palavra2
            for (char c : palavra2.toCharArray()) {
                frequencia2[c - 'a']++;
            }

            // Compara os arrays de frequência
            for (int i = 0; i < 26; i++) {
                if (frequencia1[i] != frequencia2[i]) {
                    return false;
                }
            }

            return true;
        }

        public void verificarIsAnagrama1(String[] args) {
            String palavra1 = "conta";
            String palavra2 = "canto";

        }
        
        public void verificarIsAnagrama2(String[] args) {
            String palavra1 = "arroz";
            String palavra2 = "zorra";
        }
        
        public void verificarIsAnagrama3(String[] args) {
            String palavra1 = "julia";
            String palavra2 = "julio";
        }
}