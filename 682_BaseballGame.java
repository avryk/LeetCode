class Solution {
    public int calPoints(String[] operations) {
        Integer[] nums = new Integer[operations.length];
        int soma=0;
        
        int cont=0;

        for(int i=0;i<operations.length;i++){

            switch(operations[i]){
                case "C": 
                    nums[cont-1]=null;
                    cont--;
                    break;

                case "D": 
                    nums[cont]=nums[cont-1]*2;
                    cont++;
                    break;

                case "+": 
                    nums[cont]=nums[cont-2]+nums[cont-1];
                    cont++;
                    break;

                default:
                    nums[cont]=Integer.valueOf(operations[i]);
                    cont++;
                    break;
            }
        }

        for(int i=0; i<cont; i++){
            soma+=(nums[i]==null) ? 0 : nums[i];
        }

        return soma;
    }
}