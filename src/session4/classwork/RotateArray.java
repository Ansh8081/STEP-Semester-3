package session4.classwork;
import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n=sc.nextInt();
        sc.nextLine();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Element "+(i+1)+": ");
            nums[i]=sc.nextInt();
            sc.nextLine();
        }
        System.out.print("Enter Number of Rotations: ");
        int k=sc.nextInt();
        k=k%nums.length;
        int[] newArray=new int[n];
        for(int i=0;i<n;i++){
            newArray[(i+k)%nums.length]=nums[i];
        }
        System.out.println("Rotated Array:");
        for(int i=0;i<n;i++){
            System.out.println(newArray[i]);
        }
        sc.close();
    }
}
