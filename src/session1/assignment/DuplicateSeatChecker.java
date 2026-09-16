package session1.assignment;
public class DuplicateSeatChecker {
    static int dc=0;
    static int[] checkDuplicateSeats(int[] seatNumbers){
        int[] Duplicateseats=new int[seatNumbers.length/2];
        boolean dac;
        for(int i=0;i<seatNumbers.length;i++){
            for(int j=i+1;j<seatNumbers.length;j++){
                if(seatNumbers[i]==seatNumbers[j]){
                    dac=true;
                    for(int k=0;k<dc;k++){
                        if(Duplicateseats[k]==seatNumbers[i])
                            dac=false;
                    }
                    if(dac){
                        Duplicateseats[dc]=seatNumbers[i];
                        dc++;
                    }
                }
            }
        }
        return Duplicateseats;
    }
    public static void main(String[] args) {
        int[] seatnumbers={101, 102, 103, 102, 105};
        int[] duplicateseats=checkDuplicateSeats(seatnumbers);
        if(dc!=0){
            System.out.print("Duplicate Seat Number Found: ");
            for(int i=0;i<dc;i++){
                System.out.print(duplicateseats[i]);
                if(i!=dc-1)
                    System.out.print(" ,");
            }
        }
        else
            System.out.println("No Duplicate Seats Found");
    }
}

