class Solution {


    public char[][] fazQuadro(int[][] moves){
        char[][] quadro= new char[3][3];
        for(int i=0;i<moves.length;i++){
                    quadro [moves[i][0]][moves[i][1]]= (i%2==0) ? 'A' : 'B';
        }
        return quadro;

    }

    public boolean  venceu(char[][] quadro, char jog){

        for (int i = 0; i < 3; i++) {
            if ((quadro[i][0] == jog && quadro[i][1] == jog && quadro[i][2] == jog) ||
                (quadro[0][i] == jog && quadro[1][i] == jog && quadro[2][i] == jog)) {
                return true;
            }
        }

        
        return (quadro[0][0] == jog && quadro[1][1] == jog && quadro[2][2] == jog) ||
               (quadro[0][2] == jog && quadro[1][1] == jog && quadro[2][0] == jog);
    }

    

    public String tictactoe(int[][] moves) {
    boolean venceu=false;
    char[][] quadro= fazQuadro(moves);
    boolean vence = false;

    if(moves.length % 2 ==0){
        vence = venceu(quadro, 'B');
        if(vence){
            return "B";
        }
    }else{
        vence = venceu(quadro, 'A');
        if(vence){
            return "A";
        }
    }

    return moves.length==9 ? "Draw" : "Pending";


    }
        
}
    
