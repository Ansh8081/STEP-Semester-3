package session1.assignment;
public class WarehouseInventory {
    static void analyzeInventory(int[] sectionA, int[] sectionB){
        int quantityA=0,quantityB=0,highestquantity=0,indexofhighest=0;
        String status;
        char section='A';
        for(int i=0;i<sectionA.length;i++){
            quantityA+=sectionA[i];
            quantityB+=sectionB[i];
            if(sectionA[i]>=sectionB[i]&&sectionA[i]>highestquantity){
                highestquantity=sectionA[i];
                section='A';
                indexofhighest=i;
            }
            else if(sectionB[i]>sectionA[i]&&sectionB[i]>highestquantity){
                highestquantity=sectionB[i];
                section='B';
                indexofhighest=i;
            }
        }
        if(quantityA==quantityB)
            status="Balanced";
        else
            status="Not Balanced";
        System.out.println("Section A Total: "+quantityA+" | Section B Total: "+quantityB+" | Status: "+status+" | Highest Quantity: "+highestquantity+" (Section "+section+", Item "+(indexofhighest+1)+")");
    }
    public static void main(String[] args) {
        int[] sectionA={20,15,30}, sectionB={25,10,30};
        analyzeInventory(sectionA, sectionB);
    }
}
