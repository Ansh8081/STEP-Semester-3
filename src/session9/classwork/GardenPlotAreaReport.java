package session9.classwork;
import java.util.Scanner;
interface Shape{
    double calculatearea();
    String getshape();
    String getowner();
    default void getinfo(){
        System.out.println(getowner()+" ("+getshape()+"): "+String.format("%.2f",calculatearea()));
    }
}
class Circle implements Shape{
    double radius;
    String owner,shape="CIRCLE";
    Circle(String owner,double radius){
        this.owner=owner;
        this.radius=radius;
    }
    @Override
    public double calculatearea() {
        return Math.PI*radius*radius;
    }
    @Override
    public String getowner(){
        return owner;
    }
    @Override
    public String getshape(){
        return shape;
    }
}
class Rectangle implements Shape{
    double length,breadth;
    String owner,shape="RECTANGLE";
    Rectangle(String owner,double length,double breadth){
        this.owner=owner;
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double calculatearea() {
        return length*breadth;
    }
    @Override
    public String getowner(){
        return owner;
    }
    @Override
    public String getshape(){
        return shape;
    }
}
class Triangle implements Shape{
    double base,height;
    String owner,shape="TRIANGLE";
    Triangle(String owner,double base,double height){
        this.owner=owner;
        this.base=base;
        this.height=height;
    }
    @Override
    public double calculatearea() {
        return base*height/2;
    }
    @Override
    public String getowner(){
        return owner;
    }
    @Override
    public String getshape(){
        return shape;
    }
}
public class GardenPlotAreaReport {
    static Shape getobject(String s){
        String[] a=s.trim().split("\\s+");
        switch(a[0].toLowerCase()){
            case "circle":
                return new Circle(a[1], Double.parseDouble(a[2]));
            case "rectangle":
                return new Rectangle(a[1],Double.parseDouble(a[2]),Double.parseDouble(a[3]));
            case "triangle":
                return new Triangle(a[1],Double.parseDouble(a[2]),Double.parseDouble(a[3]));
            default:
                throw new IllegalArgumentException("Invalid Shape: "+a[0]);
        }
    }
    public static void main(String[] args){
        double total=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Shape[] s=new Shape[n];
        for(int i=0;i<n;i++){
            String statement=sc.nextLine();
            s[i]=getobject(statement);
        }
        for(Shape S:s){
            S.getinfo();
            total+=S.calculatearea();
        }
        System.out.println("Total Area: "+String.format("%.2f",total));
        sc.close();
    }
}