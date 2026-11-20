package session12.assignment;
class S {
    String stop;
    S next;
    S(String stop) {
        this.stop = stop;
        this.next = null;
    }
}
public class BusRouteStops {
    static S build(String[] stops) {
        S head = new S(stops[0]);
        S temp = head;
        for (int i = 1; i < stops.length; i++) {
            temp.next = new S(stops[i]);
            temp = temp.next;
        }
        return head;
    }
    static void printRoute(S head) {
        String first = head.stop, last = null;
        int count = 0;
        while (head != null) {
            count++;
            System.out.print(head.stop + " -> ");
            if (head.next == null) {
                last = head.stop;
            }
            head = head.next;
        }
        System.out.println(head);
        System.out.println("Stops: " + count + ", First: " + first + ", Last: " + last);
    }
    public static void main(String[] args) {
        String[] stops = {"Tambaram", "Guindy", "TNagar", "Central"};
        printRoute(build(stops));
        String[] stop = {"Potheri"};
        printRoute(build(stop));
    }
}