package session2.assignment;
public class ProductInventory {
    static void parseInventoryRecord(String csvLine){
        String[] recordarr=csvLine.split(",");
        if(recordarr.length==3)
            System.out.println("Product: "+recordarr[0]+" | SKU: "+recordarr[1]+" | Qty: "+recordarr[2]);
        else
            System.out.println("Invalid Record");
    }
    public static void main(String[] args){
        String record="Wireless Mouse,WM-2201,150";
        String record2="Wireless Mouse,150";
        parseInventoryRecord(record);
        parseInventoryRecord(record2);
    }
}
