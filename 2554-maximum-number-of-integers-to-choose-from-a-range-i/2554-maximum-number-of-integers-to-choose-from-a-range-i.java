class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet();
        for(int b : banned){
            set.add(b);
        }
        int sum = 0;
        int count = 0;
        for(int i  = 1; i<=n ; i++ ){
            if(!set.contains(i)){
                sum += i;
                count++;
                if(maxSum < sum){
                    return count - 1;
                }
            }
        }
        
        return count;
    }
}