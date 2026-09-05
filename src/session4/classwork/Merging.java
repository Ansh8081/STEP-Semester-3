package session4.classwork;
import java.util.Scanner;
public class Merging {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array 1: ");
        int n1=sc.nextInt();
        sc.nextLine();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            System.out.print("Enter Element "+(i+1)+": ");
            arr1[i]=sc.nextInt();
            sc.nextLine();
        }
        System.out.print("Enter Size of Array 2: ");
        int n2=sc.nextInt();
        sc.nextLine();
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            System.out.print("Enter Element "+(i+1)+": ");
            arr2[i]=sc.nextInt();
            sc.nextLine();
        }
        int[] arr3=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1&&j<n2){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println("Merged Array:");
        for(i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
        sc.close();
    }
}