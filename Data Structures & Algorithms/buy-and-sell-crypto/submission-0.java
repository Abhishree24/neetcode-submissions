class Solution {
    public int maxProfit(int[] prices) {
        int least = 0; int max =0;
        for(int i=0;i<=prices/2;i++){
            least = Math.min(prices[i], least);
        }
        
    }
}
