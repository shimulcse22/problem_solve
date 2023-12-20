class Solution {
    public int buyChoco(int[] prices, int money) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int p : prices){
            if(p<firstMin){
                secondMin = firstMin;
                firstMin = p;
            }else{
                if(p<secondMin){
                    secondMin = p;
                }
            }
        }

        int res = money - firstMin - secondMin;

        return res >= 0 ? res : money; 
    }
}