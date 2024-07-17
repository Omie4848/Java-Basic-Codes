// public class Java37_BuyandSellstock {
//    public static void StockmaxProfit(int prices[]){
//     int profit=0;
//     int n=prices.length;
//     int buyarray[]=new int[n];
//     buyarray[0]=prices[0];
//     for(int i=1;i<n;i++){
//         buyarray[i]=Math.min(prices[i],buyarray[i-1]);
//     }

//     for(int i=1;i<n;i++){
    //   profit=Math.max(profit,prices[i]-buyarray[i-1]);  
//     }
//     if(profit>0){
//     System.out.println(profit);
//    }
//    else{
//     System.out.println(0);
//    }
// }
//     public static void main(String[] args) {
//         int prices[]={7,1,5,3,6,4};
//     StockmaxProfit(prices);
//     }
// }


public class Java37_BuyandSellstock {

    public static void StockMaxProfit(int prices[]) {
        int profit = 0;
        int n = prices.length;
        int buyarray[] = new int[n];
        buyarray[0] = prices[0]; // Initial minimum buying price

        // Find minimum buying prices for each day
        for (int i = 1; i < n; i++) {
            buyarray[i] = Math.min(prices[i], buyarray[i - 1]);
        }

        // Calculate and update profit for each day
        for (int i = 1; i < n; i++) {
            profit = Math.max(profit, prices[i] - buyarray[i ]);
        }

        if (profit > 0) {
            System.out.println("Maximum Profit: " + profit);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        int prices[] = {6,1,4,5,2,3};
        StockMaxProfit(prices);
    }
}
