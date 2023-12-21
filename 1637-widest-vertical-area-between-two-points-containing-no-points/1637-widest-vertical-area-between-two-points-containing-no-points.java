class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points,(a, b) -> Integer.compare(a[0],b[0]));
        int res = 0;
        int len = points.length;
        for(int i = 1; i< len ; i++){
            res = Math.max(res, points[i][0] - points[i-1][0]);
        }
        
        return res;
    }
}