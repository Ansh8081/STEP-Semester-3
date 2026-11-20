package session12.assignment;
class L {
    String name;
    L next;
    L(String name) {
        this.name = name;
        this.next = null;
    }
}
public class LateComersLine {
    static L addFirst(L head, String name) {
        L newnode = new L(name);
        if (head == null) {
            return newnode;
        }
        newnode.next = head;
        return newnode;
    }
    static L addLast(L head, String name) {
        L last = new L(name);
        while (head.next != null) {
            head = head.next;
        }
        head.next = last;
        return last;
    }
    static void students(L head) {
        while (head != null) {
            System.out.print(head.name + " -> ");
            head = head.next;
        }
        System.out.println(head);
    }
    public static void main(String[] args) {
        L head = new L("Asha");
        head.next = new L("Ravi");
        head = addFirst(head, "Neha");
        addLast(head, "Kiran");
        head = addFirst(head, "Mohan");
        students(head);
        L h1 = null;
        h1 = addFirst(h1, "Pooja");
        h1 = addFirst(h1, "Arjun");
        students(h1);
    }
}