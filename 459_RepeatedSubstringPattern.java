class Solution {
    public boolean repeatedSubstringPattern(String s) {

        for(int i=1; i<=s.length()/2; i++){
           
           if(s.length()%i==0){

            String s2= s.substring(0,i);
            StringBuilder repete= new StringBuilder();


            for(int j=0; j<(s.length()/i); j++){
                repete.append(s2);
            }


            if(repete.toString().equals(s)){
                return true;
            }

           }
           
        }


        return false;


    }
}