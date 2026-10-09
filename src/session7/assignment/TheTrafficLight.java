package session7.assignment;
class TrafficLight{
    private String color;
    final private String ID;
    TrafficLight(String ID){
        this.ID=ID;
        color="Red";
    }
    void next(){
        switch(color){
            case "Red":
                color="Green";
                break;
            case "Green":
                color="Yellow";
                break;
            case "Yellow":
                color="Red";
                break;
        }
    }
    void getColor(){
        System.out.println("Color is "+color);
    }
}
public class TheTrafficLight {
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");
        t.getColor();
        t.next();
        t.getColor();
        t.next() ;
        t.getColor();
        t.next();
        t.getColor();
    }
}
