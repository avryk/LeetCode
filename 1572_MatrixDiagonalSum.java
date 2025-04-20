class Solution {
    public int diagonalSum(int[][] mat) {
        int primeiro=0;
        int ultimo = mat[0].length-1;
        int cont=0;

        for(int i=0;i<mat.length;i++){
            
            cont= (primeiro==ultimo)? cont+mat[i][primeiro] : cont+ mat[i][primeiro]+ mat[i][ultimo];
            primeiro++;
            ultimo--;
        }
        return cont;
    }
}