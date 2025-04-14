class Solution {

public int signFunc(int x){

    return x==0 ? 0 : ((x<0) ? -1 : 1); // elegante pra crlh

}

    public int arraySign(int[] nums) {
        int multi=1;
        for(int num : nums){
            multi*=signFunc(num);
        }

    return multi;
    }
}