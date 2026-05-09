class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int l = 0;
        int r = 1;
        while(r< prices.length){
            if(prices[l]>prices[r]){
                l = r;
                r++;
            }
            else {
                int current = prices[r] - prices[l];
                max = Math.max(max, current);
                r++; 
            }
        }
        return max;
    }
}
