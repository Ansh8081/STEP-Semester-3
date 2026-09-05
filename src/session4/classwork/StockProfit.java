package session4.classwork;
import java.util.Scanner;
public class StockProfit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No of Known Days: ");
        int n=sc.nextInt();
        sc.nextLine();
        int[] prices=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Price for Day "+(i+1)+": ");
            prices[i]=sc.nextInt();
            sc.nextLine();
        }
        int lowest=prices[0];
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i]<lowest){
                lowest=prices[i];
            }
            if(prices[i]-lowest>profit){
                profit=prices[i]-lowest;
            }
        }
        System.out.println("Profit: "+profit);
        sc.close();
    }
}