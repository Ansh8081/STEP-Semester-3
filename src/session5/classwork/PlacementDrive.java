package session5.classwork;
class Candidate{
    String name;
    double cgpa;
    int codingscore;
    double overallscore;
    Candidate(String name,double cgpa,int codingscore){
        this.name=name;
        this.cgpa=cgpa;
        this.codingscore=codingscore;
        this.overallscore=cgpa*10+(double)codingscore*0.5;
    }
}
public class PlacementDrive {
    static boolean isEligible(double cgpa){
        if(cgpa>7)
            return true;
        else
            return false;
    }
    static boolean isEligible(double cgpa, int codingScore){
        if(cgpa>=6.5&&codingScore>=60)
            return true;
        else
            return false;
    }
    static Candidate[] shortlist(Candidate[] c){
        int j=0,k=0;
        for(Candidate candidate:c){
            if(isEligible(candidate.cgpa)||isEligible(candidate.cgpa,candidate.codingscore))
                j++;
        }
        Candidate[] shortlisted=new Candidate[j];
        for(Candidate candidate:c){
            if(isEligible(candidate.cgpa)||isEligible(candidate.cgpa,candidate.codingscore)){
                shortlisted[k]=candidate;
                k++;
            }
        }
        return shortlisted;
    }
    static void shortlistAndRank(Candidate[] shortlist){
        Candidate temp;
        for(int i=0;i<shortlist.length;i++){
            for(int j=i+1;j<shortlist.length;j++){
                if(shortlist[i].overallscore<shortlist[j].overallscore){
                    temp=shortlist[i];
                    shortlist[i]=shortlist[j];
                    shortlist[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Candidate[] c={new Candidate("Aisha", 8.2, 40),new Candidate("Rohit", 6.8, 65),new Candidate("Meena", 6.0, 90),new Candidate("Karan", 7.5,20)};
        Candidate[] shortlist=shortlist(c);
        shortlistAndRank(shortlist);
        int i=1;
        for(Candidate candidate:shortlist){
            System.out.println("Rank "+i);
            System.out.println("Name  : "+candidate.name);
            System.out.println("Score : "+candidate.overallscore);
            i++;
        }
    }
}
