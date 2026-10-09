package session7.assignment;
class Playlist{
    private String[] titles;
    private int maximum;
    private int counter=0;
    Playlist(int maximum){
        this.maximum=maximum;
        titles=new String[maximum];
    }
    void addSong(String Song){
        if(counter<maximum)
            titles[counter++]=Song;
    }
    String[] getSongs(){
        String[] title=new String[counter];
        for(int i=0;i<counter;i++){
            title[i]=titles[i];
        }
        return title;
    }
    int getSongCount(){
        return counter;
    }
}
public class ThePlaylist {
    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");
        String[] copy = p.getSongs();
        copy[0] = "Hacked";
        for(String s:copy){
            System.out.print(s+" ");
        }
        System.out.println("\n"+p.getSongs()[0]);
        System.out.println("Count = "+p.getSongCount());
    }
}
