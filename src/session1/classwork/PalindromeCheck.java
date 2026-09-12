package session1.classwork;
import java.util.Scanner;
public class PalindromeCheck {
    static String iterative(String word){
        int k=0;
        for(int i=0;i<(word.length()/2);i++){
            if(word.charAt(i)==word.charAt(word.length()-i-1))
                k++;
        }
        if(k++==word.length()/2)
            return "Palindrome";
        else
            return "Not Palindrome";
    }
    static String recursive(String word){
        if(word.charAt(0)==word.charAt(word.length()-1)&&word.length()>2){
            StringBuilder sb=new StringBuilder(word);
            sb.deleteCharAt(word.length()-1);
            sb.deleteCharAt(0);
            word=sb.toString();
            return recursive(word);
        }
        else if(word.length()<=2&&word.charAt(0)==word.charAt(word.length()-1))
            return "Palindrome";
        else
            return "Not Palindrome";
    }
    static String array(String word){
        char[] arr=new char[word.length()];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=word.charAt(j);
            j++;
        }
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==arr[i])
                j--;
        }
        if(j==0)
            return "Palindrome";
        else
            return "Not Palindrome";

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String word=sc.next();
        System.out.println("Iterative: "+iterative(word)+" | Recursive: "+recursive(word)+" | Array Reversal: "+array(word));
        sc.close();
    }
}

