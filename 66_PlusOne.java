class Solution {

    public int[] pp(int[] digits,int  pos){
        if (pos < 0) {
            int[] digitos2 = new int[digits.length + 1];
            digitos2[0] = 1;
            return digitos2;
        }

        if(digits[pos]!=9){
            digits[pos]+=1;
            return digits;
        }


        digits[pos]=0;
        return pp(digits, pos-1);

    }

    public int[] plusOne(int[] digits) {
        
        return pp(digits, digits.length-1);
    }
}