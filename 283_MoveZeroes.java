class Solution {
    public void moveZeroes(int[] nums) {
        int total= nums.length;
        int cont=0;
        

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[cont]=nums[i];
                cont++;
            }
        }

        for(int i=cont;i<total;i++)
        {
            nums[i]=0;
        }
    }
}