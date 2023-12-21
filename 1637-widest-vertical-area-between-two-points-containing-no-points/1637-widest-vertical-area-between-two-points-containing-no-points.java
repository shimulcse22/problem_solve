class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Set<Integer> s = new TreeSet();
        
        for(int a [] : points){
            s.add(a[0]);
        }
    
        int res = 0;
        int prevX = Integer.MIN_VALUE;
        
        for(int x : s){
            if(prevX != Integer.MIN_VALUE){
                res = Math.max(res, x - prevX);
            }
            prevX = x;
        }
        
        return res;
    }
}