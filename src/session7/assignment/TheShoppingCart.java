package session7.assignment;
class Cart{
    private double[] itemprices;
    private int maximum,index=0;
    final private String ID;
    Cart(String ID,int maximum){
        itemprices=new double[maximum];
        this.ID=ID;
        this.maximum=maximum;
    }
    void addItem(double amount){
        if(index<maximum)
            itemprices[index++]=amount;
    }
    void getTotal(){
        double sum=0;
        for(int i=0;i<index;i++){
            sum+=itemprices[i];
        }
        System.out.println("Total = "+sum);
    }
    void getItemCount(){
        System.out.println("Item Count = "+index);
    }
}
public class TheShoppingCart {
    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);
        cart.getTotal();
        cart.getItemCount();
    }
}
