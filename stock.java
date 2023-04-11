public class stock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        
        System.out.println(Maxprofit(prices));
    }
    static int Maxprofit(int[] prices){
        int max_profit =0;
        int min = prices[0];
        for(int i=0;i<prices.length;i++){

            min = Math.min(min,prices[i]);
            int profit = prices[i] - min;
            max_profit = Math.max(max_profit,profit);

        }
        return max_profit;
    }
}
