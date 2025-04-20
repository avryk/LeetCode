class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        if(nums.length<3){
            return 0;
        }

        for(int i=nums.length-1; i>1;i--){
            int hip=nums[i];
            int a =nums[i-1];
            int b =nums[i-2];

            if(a+b>hip){
                return a+b+hip;
            }

        }
        return 0;
        
    }
}