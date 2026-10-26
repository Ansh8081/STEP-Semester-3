package session10.classwork;
import java.util.Scanner;
public class WordReverserPalindrome {
    static String[] reverser(String[] a){
        String[] reverse=new String[a.length];
        for(int i=0;i<a.length;i++){
            StringBuilder sb=new StringBuilder(a[i]);
            reverse[i]=sb.reverse().toString().toLowerCase();
        }
        return reverse;
    }
    static String isplaindrome(String a,String b){
        if(a.equalsIgnoreCase(b))
            return "palindrome";
        else
            return "not a palindrome";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n=sc.nextInt();
        sc.nextLine();
        String[] a=new String[n];
        System.out.println("Enter words");
        for(int i=0;i<n;i++){
            a[i]=sc.nextLine();
        }
        String[] b=reverser(a);
        System.out.println("Reversed Words and Palindrome Status");
        for(int i=0;i<n;i++){
            System.out.println(b[i]+" - "+isplaindrome(a[i],b[i]));
        }
        sc.close();
    }
}
