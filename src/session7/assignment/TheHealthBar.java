package session7.assignment;
class Character{
    private int health;
    final private int maximum;
    Character(int maximum){
        this.maximum=maximum;
        health=maximum;
    }
    void takeDamage(int amount){
        if(health-amount>=0)
            health-=amount;
        else
            health=0;
    }
    void heal(int amount){
        if(health+amount>maximum)
            health=maximum;
        else
            health+=amount;
    }
    void display(){
        System.out.println("Health = "+health);
    }
}
public class TheHealthBar {
    public static void main(String[] args) {
        Character c = new Character(100);
        c.takeDamage(30);
        c.display();
        c.heal(50);
        c.display();
        c.takeDamage(150);
        c.display();
    }
}
