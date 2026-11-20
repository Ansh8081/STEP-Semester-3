package session12.assignment;
class P {
    String plate;
    P next;

    P(String plate) {
        this.plate = plate;
        this.next = null;
    }
}
public class PlateStackonChain {
    static P top;
    static int size = 0;
    static void push(String plate) {
        if (top == null) {
            top = new P(plate);
        } else {
            P newnode = new P(plate);
            newnode.next = top;
            top = newnode;
        }
        size++;
        System.out.println("top " + top.plate + ", size " + size);
    }
    static void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            size--;
            System.out.println(top.plate + ", size " + size);
            top = top.next;
        }
    }
    static void peek() {
        if (top != null) {
            System.out.println(top.plate);
        } else {
            System.out.println("Stack is empty");
        }
    }
    static boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        push("P1");
        push("P2");
        peek();
        pop();
        push("P3");
        pop();
        pop();
        pop();
        System.out.println(isEmpty());
    }
}