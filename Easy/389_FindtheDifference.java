class Solution {
    public char findTheDifference(String s, String t) {

    int maior = (s.length()<t.length()) ? t.length() : s.length();

    Map<Character, Integer> map= new HashMap<>();


    for(int i=0;i<maior;i++){

        if(s.length()>i){
        if(map.containsKey(s.charAt(i))){
            int novoValor=  map.get(s.charAt(i)) + 1;
            map.put(s.charAt(i), novoValor);
        }else{
            map.put(s.charAt(i), 1);
        }
        }


        if(t.length()>i){
        if(map.containsKey(t.charAt(i))){

            int novoValor=  map.get(t.charAt(i)) + 1;
            map.put(t.charAt(i), novoValor);

        }else{
            map.put(t.charAt(i), 1);
        }
        }
    }

    for(char chave : map.keySet()){
        if(map.get(chave)%2!=0){
            return chave;
        }
    }

    return ' ';
    
    }
}