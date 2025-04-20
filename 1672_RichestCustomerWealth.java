class Solution {
    public int maximumWealth(int[][] accounts) {

        int maiorConta=0;
        int contInter;

        for(int i=0;i< accounts.length; i++){
            contInter=0;
            for(int j=0; j< accounts[i].length; j++){
                contInter+=accounts[i][j];
            }
            maiorConta= (contInter>maiorConta)? contInter: maiorConta;
        }
        return maiorConta;
        
    }
}