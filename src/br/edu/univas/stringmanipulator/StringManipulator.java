package br.edu.univas.stringmanipulator;


import java.util.Arrays;


public class StringManipulator {
	
	
	public int getNumeroVogais(String stringmanipulator) {
		int count = 0;
		for(char c : stringmanipulator.toCharArray()) {
			if ("aeiouAEIOU".indexOf(c) != -1){
				count++;
				
				
			}
		}
		
		return count;
	}
	

	public int getNumeroConsoantes(String stringmanipulator) {
		int count = 0;
		for(char c : stringmanipulator.toCharArray()) {
			if (Character.isLetter(c) && "aeiouAEIOU".indexOf(c) == -1){
				count++;
			}
		}
		return count;
	
	
	}


  
    public boolean getIsAnagrama(String valor1, String valor2) {
    	char[] str1 = valor1.toCharArray();
    	char[] str2 = valor2.toCharArray();
    	Arrays.sort(str1);
    	Arrays.sort(str2);
    	
   
  
    	
    	return Arrays.equals(str1, str2);
    }
    
    	
}
  
  




