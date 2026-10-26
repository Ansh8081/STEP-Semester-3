package session10.classwork;
import java.util.Scanner;
public class VowelConsonantCounter{
    public static void main(String[] args) {
        int vowel=0,consonant=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Word: ");
        String s=sc.next().toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                vowel++;
            else
                consonant++;
        }
        System.out.println("Vowels: "+vowel+"\nConsonants: "+consonant);
        sc.close();
    }
}