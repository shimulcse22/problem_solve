class Solution {
    public int[] pivotArray(int[] n, int pivot) {
        int len = n.length;
        int res [] = new int[len];
        int j = 0;
        
        for(int i = 0; i<len ; i++){
            if(n[i] < pivot){
                res[j] = n[i];
                j++;
            }
        }

        for(int i = 0; i<len ; i++){
            if(n[i] == pivot){
                res[j] = n[i];
                j++;
            }
        }
        
        for(int i = 0; i<len ; i++){
            if(n[i] > pivot){
                res[j] = n[i];
                j++;
            }
        }
        
        return res;
    }
}