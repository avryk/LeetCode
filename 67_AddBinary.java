class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder maior=(a.length()>=b.length()) ? new StringBuilder(a) : new StringBuilder(b);
        StringBuilder menor=(a.length()>=b.length()) ? new StringBuilder(b) : new StringBuilder(a);
        int falta=(maior.length()-menor.length());

        StringBuilder pref= new StringBuilder();
        for(int i=0;i<falta;i++){
            pref.append('0');
        }
        menor.insert(0, pref);
        StringBuilder result= new StringBuilder();
        int eVaiUm=0;



        for(int i=maior.length()-1;i>=0;i--){

            int conta=maior.charAt(i)- '0' + (int)menor.charAt(i)- '0' + eVaiUm;

            if(conta==0){
                result.insert(0, '0');
                eVaiUm=0;
            }
            if(conta==1){
                result.insert(0, '1');
                eVaiUm=0;
            }
            if(conta==2){
                result.insert(0, '0');
                eVaiUm=1;
            }
            if(conta==3){
                result.insert(0, '1');
                eVaiUm=1;
            }
        }

        if(eVaiUm==1){
            result.insert(0, '1');
        }
        return result.toString();

    }
}