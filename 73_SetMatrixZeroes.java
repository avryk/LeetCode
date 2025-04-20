class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    x.add(i);
                    y.add(j);
                }
            }
        }


        for(int xs : x){
            Arrays.fill(matrix[xs], 0);
        }

        for(int ys : y){
            for(int i=0;i<matrix.length;i++){
                matrix[i][ys]=0;
            }
        }
        
    }
}