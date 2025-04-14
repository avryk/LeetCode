class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean mono=true;
        int i=0;
        int conta=0;

        while(mono==true && i<nums.length-1){
            
 		    conta = (conta==0) ? nums[i+1]-nums[i] : conta;
            mono = conta>0 ? ((nums[i+1] - nums[i]>=0 )? true : false) : ((nums[i+1] - nums[i]<=0 )? true : false);
            i++;

        }
        return mono;
    }
}