package session1.classwork;
import java.util.Scanner;
public class FirstNonRepeating {
    static char findFirstNonRepeatingChar(String word){
        char[] arr=new char[word.length()];
        for(int i=0;i<word.length();i++)
            arr[i]=word.charAt(i);
        int[] frequency=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            frequency[i]=1;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]&&i!=j)
                    frequency[i]++;
            }
        }
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]==1)
                return arr[i];
        }
        return ' ';
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Word: ");
        String word=sc.next();
        if(findFirstNonRepeatingChar(word)!=' ')
            System.out.println("First Non-Repeating Character: "+findFirstNonRepeatingChar(word));
        else
            System.out.println("No Non-Repeating Character Found");
        sc.close();
    }
}
