package session2.assignment;
public class WordReversalEncoder{
    static String reverseEachWord(String sentence){
        String[] wordarr=sentence.split(" ");
        StringBuilder s=new StringBuilder(sentence);
        s.delete(0, sentence.length());
        for(int i=0;i<wordarr.length;i++){
            StringBuilder sb=new StringBuilder(wordarr[i]);
            wordarr[i]=sb.reverse().toString();
            if(i==wordarr.length-1){
                s.append(wordarr[i]);
                break;
            }
            s.append(wordarr[i]+" ");
        }
        return s.toString();
    }
    public static void main(String[] args){
        String sentence="hello club";
        System.out.println(reverseEachWord(sentence));
    }
}