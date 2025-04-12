class Solution {
    public int strStr(String haystack, String needle) {
        int need=needle.length();

        for(int i=0;i<haystack.length(); i++){
        if (i + need <= haystack.length()){

        String tempo = haystack.substring(i, i+need);
            if(tempo.equals(needle)){
                return i;
            }

        }

        }


        return -1;

    }
}