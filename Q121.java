public class Q121 {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
       System.out.println(maxProfit(prices)); 
    }
    public static int maxProfit(int[] prices) {
        int buyp = prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyp){
                buyp=prices[i];
            }
            profit = Math.max(profit, prices[i]-buyp);
        }
        return profit;    
    }
}
