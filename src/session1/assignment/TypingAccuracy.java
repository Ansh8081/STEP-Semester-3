package session1.assignment;
public class TypingAccuracy {
    static int matched=0,firstmismatch=-1;
    static void checkTypingAccuracy(String original, String typed){
        for(int i=0;i<original.length();i++){
            if(original.charAt(i)==typed.charAt(i))
                matched++;
            else if(firstmismatch==-1){
                firstmismatch=i;
            }
        }
    }
    public static void main(String[] args) {
        String original="hello world";
        String typed="hello worlt";
        checkTypingAccuracy(original, typed);
        if(firstmismatch!=-1)
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')",matched,original.length(),((double)matched/original.length())*100,(firstmismatch+1),original.charAt(firstmismatch),typed.charAt(firstmismatch));
            // In case of printf use %% to print %
        else
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches",matched,original.length(),((double)matched/original.length())*100,(firstmismatch+1));
    }
}

