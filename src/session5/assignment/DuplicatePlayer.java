package session5.assignment;
public class DuplicatePlayer {
    static String findDuplicatePick(String[] playerNames){
        for(int i=0;i<playerNames.length;i++){
            for(int j=i+1;j<playerNames.length;j++){
                if(playerNames[i].equals(playerNames[j]))
                    return "Duplicate Found";
            }
        }
        return "No Duplicates Found";
    }
    public static void main(String[] args){
        String[] playerNames={"Kohli", "Bumrah", "Kohli", "Rohit"};
        System.out.print(findDuplicatePick(playerNames));
    }
}
