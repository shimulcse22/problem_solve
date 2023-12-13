class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int res = 1;

        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());

        for(int i = 0; i<len ; i++){
            pq.offer(nums[i]);
        }
        int j  = 2;
        
        while( j-- > 0){
            res *= (pq.poll() - 1);
        }
        return res;
    }
}