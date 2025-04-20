class Solution {
    public boolean isRobotBounded(String instructions) {
        int[] pos = {0,0};
        int cont=0;

        for(int j=0; j<4;j++){

            for(int i=0; i<instructions.length();i++){

                cont = (cont + 4) % 4;
                switch(instructions.charAt(i)){
                    case 'G': 
                        if(cont%2==0){
                            pos[0]= (cont==0)? pos[0]+1 : pos[0]-1;
                        }else{
                            pos[1]= (cont==1)? pos[1]+1 : pos[1]-1;
                        }break;
            
                    case 'L':cont--;break;
                    case 'R':cont++;break;
                    default:break;
                }    

        }
        if(pos[0]==0 && pos[1]==0)return true;
        }
        
    return false;

    }
}