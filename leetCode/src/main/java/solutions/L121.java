package leetCode.src.main.java.solutions;

/**
 * @author: weibin.wang
 * @date: 6/1/24
 */
public class L121 {
    public int maxProfit(int[] prices) {
        //integer overflow
        int profit = 0;
        int lsf = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            }
            int currentProfit = prices[i] - lsf;
            if (profit < currentProfit) {
                profit = currentProfit;
            }
        }
        return profit;
    }
}
