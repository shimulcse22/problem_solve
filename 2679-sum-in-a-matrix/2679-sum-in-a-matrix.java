class Solution {
    public int matrixSum(int[][] nums) {
        int rowLen = nums.length;
        int colLen = nums[0].length;
        int sum = 0;
        
        for (int[] num : nums) {
            Arrays.sort(num);
        }

        for(int j = 0; j<colLen ; j++){
            int max = -1;
            for(int i = 0;i<rowLen ; i++){
                max = Math.max(max,nums[i][j]);
            }
            sum += max;
        }

        return sum;
    }
}