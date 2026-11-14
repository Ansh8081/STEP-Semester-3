package session11.assignment;
public class TheDiceThrowTally {
    static int[] diceSort(int[] rolls){
        int[] count={0,0,0,0,0,0};
        for(int i=0;i<rolls.length;i++){
            if(rolls[i]==1)
                count[0]++;
            else if(rolls[i]==2)
                count[1]++;
            else if(rolls[i]==3)
                count[2]++;
            else if(rolls[i]==4)
                count[3]++;
            else if(rolls[i]==5)
                count[4]++;
            else
                count[5]++;
        }
        System.out.println("Counts: 1:"+count[0]+" 2:"+count[1]+" 3:"+count[2]+" 4:"+count[3]+" 5:"+count[4]+" 6:"+count[5]);
        for(int i=0;i<rolls.length;i++){
            for(int j=0;j<=5;j++){
                if(count[j]!=0){
                    rolls[i]=j+1;
                    count[j]--;
                    break;
                }
            }
        }
        return rolls;
    }
    public static void main(String[] args) {
        int[] rolls={4,1,6,4,2,1,4};
        int[] sorted=diceSort(rolls);
        System.out.print("Sorted: [");
        for(int i:sorted)
            System.out.print(i+", ");
        System.out.println("]");
    }
}
