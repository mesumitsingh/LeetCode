class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE, sell=0; 
        for(int i=0; i<prices.length; i++) { 
            if(prices[i]<buy) { 
                buy = prices[i];
            }
            
            if(prices[i]-buy > sell) { 
                sell = prices[i]-buy;
            }
        }

        return sell;
    }
}