package session1.assignment;
public class MovieReview {
    static void classifyWordLengths(String review){
        String[] strarr=review.split(" ");
        int shor=0,med=0,lon=0;
        for(String s:strarr){
            if(s.length()<5)
                shor++;
            else if(s.length()<9)
                med++;
            else
                lon++;
        }
        System.out.println("Short: "+shor+" | Medium: "+med+" | Long: "+lon);
    }
    public static void main(String[] args) {
        String review="This movie was absolutely fantastic and thrilling";
        classifyWordLengths(review);
    }
}
