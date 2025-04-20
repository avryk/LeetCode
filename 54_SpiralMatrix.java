class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> lista = new ArrayList<>();
        Integer l1=0;
        Integer l2=matrix.length-1;
        Integer c1=0;
        Integer c2=matrix[0].length-1;
        
        while(l1<=l2 && c1<=c2){

            for(int i=c1; i<=c2; i++){
                lista.add((Integer) matrix[l1][i]);
            }

            for(int i=l1+1; i<=l2; i++){
                lista.add((Integer)matrix[i][c2]);
            }

            if(l1<l2)
            for(int i=c2-1; i>=c1; i--){
                lista.add((Integer)matrix[l2][i]);
            }

            if(c1<c2)
            for(int i=l2-1; i>l1; i--){
                lista.add((Integer)matrix[i][c1]);
            }

            l1++;
            c2--;
            l2--;
            c1++;

        } 
        return lista;
    }
}