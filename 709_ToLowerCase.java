class Solution {
    public String toLowerCase(String s) {
        StringBuilder s2 = new StringBuilder(s);
        for(int i=0; i<s.length();i++){
            if((int) s.charAt(i) <= 90 && (int) s.charAt(i)>=65){
                
                s2.setCharAt(i, (char) ((int) s.charAt(i) + 32));
            }else{
                s2.setCharAt(i, s.charAt(i));
            }
        }
        return s2.toString();
    }
}