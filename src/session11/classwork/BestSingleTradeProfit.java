package session11.classwork;
public class BestSingleTradeProfit {
    static int buy=0,sell=0;
    static int maxProfit(int[] prices){
        int max=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>max){
                    max=prices[j]-prices[i];
                    sell=j;
                    buy=i;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] price = {7,6,4,3,1};
        System.out.print(maxProfit(prices));
        if(maxProfit(prices)!=0){System.out.println(" (buy at "+(buy+1)+", sell at "+(sell+1)+")");}
        System.out.print(maxProfit(price));
        if(maxProfit(price)!=0){System.out.println("(buy at "+(buy+1)+", sell at "+(sell+1)+")");}
    }
}
