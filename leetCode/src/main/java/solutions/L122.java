package leetCode.src.main.java.solutions;

/**
 * @author: weibin.wang
 * @date: 7/1/24
 */
public class L122 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
