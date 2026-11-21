package session12.classwork;
public class LibraryReturnDesk {
    static String[] stack=new String[3];
    static String[] queue=new String[3];
    static int top=-1;
    static int front=-1,rear=-1;
    static void RETURN(String s){
        if(top==2){
            System.out.println(s+" rejected: pile is full");
            return;
        }
        stack[++top]=s;
        System.out.println(s+" placed on pile");
    }
    static void SHELVE(){
        if(top==-1){
            System.out.println("pile is empty");
            return;
        }
        System.out.println("shelved "+stack[top--]);
    }
    static void WAIT(String s){
        if(front==-1&&rear==-1){
            queue[++front]=s;
            rear++;
            System.out.println(queue[rear]+" joined the line");
        }
        else if((rear+1)%3==front){
            System.out.println("line if full");
        }
        else{
            rear=(rear+1)%3;
            queue[rear]=s;
            System.out.println(queue[rear]+" joined the line");
        }
    }
    static void SERVE(){
        if(front==-1){
            System.out.println("no one waiting");
        }
        else if(front==rear){
            System.out.println("served "+queue[front]);
            front=-1;
            rear=-1;
        }
        else{
            System.out.println("served "+queue[front]);
            front=(front+1)%3;
        }
    }
    public static void main(String[] args) {
        RETURN("B1");
        RETURN("B2");
        RETURN("B3");
        RETURN("B4");
        WAIT("Asha");
        WAIT("Ravi");
        SHELVE();
        SERVE();
        SHELVE();
        SHELVE();
        SHELVE();
        SERVE();
        SERVE();
    }
}

