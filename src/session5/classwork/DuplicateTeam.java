package session5.classwork;
public class DuplicateTeam{
    public static void main(String[] args) {
        boolean status=false;
        String[] teams={"ByteForce", "CodeCrafters", "NullPointers"};
        for(int i=0;i<teams.length;i++){
            for(int j=1+i;j<teams.length;j++){
                if(teams[i].equals(teams[j])){
                    System.out.print(teams[i]);
                    status=true;
                }
            }
        }
        if(!status){
            System.out.println("No Duplicate teams found");
        }
    }
}

