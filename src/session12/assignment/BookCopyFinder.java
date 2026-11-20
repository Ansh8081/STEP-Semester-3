package session12.assignment;
import java.util.Scanner;
class Node{
    String id;
    Node next;
    Node(String id){
        this.id=id;
        this.next=null;
    }
}
public class BookCopyFinder {
    static Node createtrolley(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book IDs in order you want to store and at last add end:");
        String b=sc.next();
        Node head=new Node(b);
        Node temp=head;
        while(!b.equals("end")){
            b=sc.next();
            temp.next=new Node(b);
            temp=temp.next;
        }
        sc.close();
        return head;
    }
    static String find(Node head, String id){
        int position=0,copies=0,first=0;
        while(head!=null){
            position++;
            if(head.id.equals(id)&&copies==0){
                first=position;
                copies++;
            }
            else if(head.id.equals(id)){copies++;}
            head=head.next;
        }
        if(copies==0){return id+" not found";}
        return id+" first at position "+first+", copies: "+copies;
    }
    public static void main(String[] args) {
        Node head=createtrolley();
        System.out.println(find(head, "B07"));
        System.out.println(find(head, "B99"));
    }
}
