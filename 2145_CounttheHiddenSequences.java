class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long diff=0;
        long menor=0;
        long maior=0;

        for(int d : differences){
            diff+=d;
            menor= (diff<menor) ? diff : menor;
            maior= (diff>maior) ? diff : maior;
        }

        return (int)((upper-lower)-(maior-(menor))+1)>0?(int)((upper-lower)-(maior-(menor))+1):0;

    }
}