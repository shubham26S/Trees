class BuySellStocks{
  public static void main(String[] args){
    int[] arr = {7, 6, 4, 3, 1};
    BuySellStocks b = new BuySellStocks();
    System.out.println(b.maxProfit(arr));
  }
  public int maxProfit(int[] prices) {
    int max = 0;
    for(int i = 1; i < prices.length; i++){
      for(int j = i-1; j >= 0; j--){
        int diff =
        max = max > (prices[i] - prices[j]) ? max : (prices[i] - prices[j]);
      }
    }
    return max;

   }
}
