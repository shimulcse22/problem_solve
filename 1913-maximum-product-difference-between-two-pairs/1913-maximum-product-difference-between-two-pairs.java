class Solution {
    public int maxProductDifference(int[] nums) {
        int firstBig = 0;
        int secondBig = 0;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        

        for(int num : nums){
            if(num > firstBig){
                secondBig = firstBig;
                firstBig = num;
            }else if(num > secondBig){
                secondBig = num;
            }
            if(num < firstMin){
                secondMin = firstMin;
                firstMin = num;
            }else if(num < secondMin){
                secondMin = num ;
            }
        }

        return (firstBig * secondBig) - (firstMin * secondMin);
    }
}