package session11.assignment;
public class QueueInOrder {
    static int studenttoken(int[] tokens){
        for(int i=1;i<tokens.length;i++){
            if(tokens[i-1]>tokens[i])
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] tokens={3,5,5,8,6,9};
        System.out.println(studenttoken(tokens));
        int[] token={1,2,2,7};
        System.out.println(studenttoken(token));
    }
}

