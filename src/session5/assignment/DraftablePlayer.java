package session5.assignment;
class Player{
    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;
    boolean isdraftable;
    public Player(String name, int matchesPlayed, double battingAverage, boolean injured){
        this.name=name;
        this.matchesPlayed=matchesPlayed;
        this.battingAverage=battingAverage;
        this.injured=injured;
        this.isdraftable=(DraftablePlayer.isDraftable(matchesPlayed)|| DraftablePlayer.isDraftable(matchesPlayed,injured));
    }
}
public class DraftablePlayer{
    static boolean isDraftable(int matchesPlayed){
        return matchesPlayed>=10;
    }
    static boolean isDraftable(int matchesPlayed, boolean injured){
        return matchesPlayed>=5&&injured==false;
    }
    static int sort(Player[] players){
        Player temp;
        int count=0;
        for(int i=0;i<players.length;i++){
            for(int j=i+1;j<players.length;j++){
                if(players[i].isdraftable&&players[j].isdraftable&&players[i].battingAverage<players[j].battingAverage){
                    temp=players[i];
                    players[i]=players[j];
                    players[j]=temp;
                }
                else if(!players[i].isdraftable&&players[j].isdraftable){
                    temp=players[i];
                    players[i]=players[j];
                    players[j]=temp;
                }
            }
            if(players[i].isdraftable){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Player[] players=new Player[4];
        players[0]=new Player("Virat", 15, 48.0, false);
        players[1]=new Player("Rahul", 7, 55.0, false);
        players[2]=new Player("Sameer", 3, 60.0, false);
        players[3]=new Player("Dev", 12, 20.0, true);
        int c=sort(players);
        for(int i=0;i<c;i++){
            System.out.print(i+1+". "+players[i].name);
            if(i!=(c-1)){
                System.out.print(" | ");
            }
        }
    }
}
