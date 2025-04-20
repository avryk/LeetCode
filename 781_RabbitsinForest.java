class Solution {
    public int numRabbits(int[] answers) {
        int cont=0;

        HashMap<Integer, Integer> nRes = new HashMap<>();

        for(int ans : answers){
            if(nRes.containsKey(ans)){
                    nRes.put((Integer)ans, nRes.get(ans) + 1);            
                }else{
                    nRes.put((Integer)ans, (Integer)1);
                }
        }

        for (Integer rs : nRes.keySet()){

            int grp = rs + 1;
            int contV= nRes.get(rs);
            int grupos = (contV + grp - 1) / grp;

            cont += grupos * grp;

        }
        return cont;

    }
}