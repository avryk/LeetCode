class Solution {
    public String mergeAlternately(String word1, String word2) {
        

        int menor = (word1.length()<word2.length()) ? word1.length() : word2.length();
        StringBuilder saida = new StringBuilder();
        for(int i=0; i<menor;i++){

            saida.append(word1.charAt(i));
            saida.append(word2.charAt(i));
        }

        
            saida.append((word1.length()<word2.length()) ? word2.substring(menor, word2.length()) : word1.substring(menor, word1.length()));

            String saida2=saida.toString();
            return saida2;  

    }
}