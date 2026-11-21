package session12.classwork;
import java.util.Scanner;
public class WeeklyRainfallAnalysis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total=0;
        int max=0,dry=0;
        double[] rain=new double[7];
        for(int i=0;i<7;i++){
            rain[i]=sc.nextInt();
        }
        sc.nextLine();
        System.out.print("Rainfall (mm): ");
        for(int i=0;i<7;i++){
            System.out.print(String.format("%.2f",rain[i])+" ");
            total+=rain[i];
            if(rain[i]>rain[max]){
                max=i;
            }
            if(rain[i]==0){dry++;}
        }
        System.out.println("\nTotal Rainfall: "+String.format("%.2f",total)+" mm");
        System.out.println("Average Rainfall: "+String.format("%.2f",total/7)+" mm");
        System.out.println("Wettest Day: "+(max+1)+" ("+String.format("%.2f",rain[max])+" mm)");
        System.out.println("Total Dry Days: "+dry);
        sc.close();
    }
}

