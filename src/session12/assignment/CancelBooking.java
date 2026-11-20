package session12.assignment;
class B {
    String booking;
    B next;
    B(String booking) {
        this.booking = booking;
        this.next = null;
    }
}
public class CancelBooking {
    static B removeFirst(B head, String booking) {
        B temp = head;
        if (temp.booking.equals(booking)) {
            head = temp.next;
            return head;
        }
        temp = head.next;
        while (temp.next != null) {
            if (temp.next.booking.equals(booking)) {
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        System.out.println(booking + " not found");
        return head;
    }
    static void booking(B head) {
        while (head != null) {
            System.out.print(head.booking + " -> ");
            head = head.next;
        }
        System.out.println(head);
    }
    public static void main(String[] args) {
        // B head = new B("104");
        // head.next = new B("101");
        // head.next.next = new B("107");
        // head.next.next.next = new B("101");
        // head = removeFirst(head, "101");
        // booking(head);
        // B head = new B("104");
        // head.next = new B("101");
        // head.next.next = new B("107");
        // head = removeFirst(head, "104");
        // booking(head);
        B head = new B("104");
        head.next = new B("101");
        head = removeFirst(head, "200");
        booking(head);
    }
}
