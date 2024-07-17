/**
 * Java37_PracticeBuySellStock
 */
public class Java37_PracticeBuySellStock {
    public static void StockHighProfit(int prices[]){
        int n=prices.length;
        int maxprofit=0;
        int BestBuyPri=Integer.MAX_VALUE;
      for(int i=0;i<n;i++){
        if(BestBuyPri<prices[i]){
             int profit=prices[i]-BestBuyPri;
                maxprofit=Math.max(maxprofit,profit);
        }
        else{
            BestBuyPri=prices[i];
        }
      }
      System.out.println(maxprofit);
        
    }
  public static void main(String[] args) {
    int prices[]={2,3,5,1,7,9,3};
    StockHighProfit(prices);


  }
    
}
