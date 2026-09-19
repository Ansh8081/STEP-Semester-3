package session2.classwork;
import java.util.Scanner;
public class VowelConsonents{
    static int v=0,c=0;
    static void countVowelsAndConsonants(String text){
        String textlower=text.toLowerCase();
        for(int i=0;i<textlower.length();i++){
            if(textlower.charAt(i)=='a'||textlower.charAt(i)=='e'||textlower.charAt(i)=='i'||textlower.charAt(i)=='o'||textlower.charAt(i)=='u')
                v++;
            else if(textlower.charAt(i)!=' ')
                c++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text=sc.nextLine();
        countVowelsAndConsonants(text);
        System.out.println("Vowels: "+v+" | Consonents: "+c);
        sc.close();
    }
}