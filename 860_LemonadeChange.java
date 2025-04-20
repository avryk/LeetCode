class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> caixa= new HashMap<>();
        caixa.put(5, 0);
        caixa.put(10, 0);
        caixa.put(20, 0);
        
        if(bills[0]>5){return false;}

        for(int nota: bills){
            switch(nota){
                case 20: 
                    if(caixa.get(10)>0 && caixa.get(5)>0){
                        caixa.put(10, caixa.get(10)-1);
                        caixa.put(5, caixa.get(5)-1);
                    }else if(caixa.get(5)>2){
                        caixa.put(5, caixa.get(5)-3);
                    }else{
                        return false;
                    }break;
                case 10:
                    if(caixa.get(5)>0){
                        caixa.put(5, caixa.get(5)-1);
                    }else{
                        return false;
                    }break;

                default:break;
            }
                caixa.put(nota, caixa.get(nota)+1);
            
        }

        return true;


        
    }
}