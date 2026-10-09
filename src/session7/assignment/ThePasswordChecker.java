package session7.assignment;
class PasswordChecker{
    private String password;
    PasswordChecker(String password){
        this.password=password;
    }
    void getStrength(){
        if(password.length()>=10)
            System.out.println("Strong");
        else if(password.length()>=6)
            System.out.println("Medium");
        else
            System.out.println("Weak");
    }
}
public class ThePasswordChecker {
    public static void main(String[] args) {
        PasswordChecker pc = new PasswordChecker("abcd");
        pc.getStrength();
        PasswordChecker pc2 = new PasswordChecker("abcdefghij");
        pc2.getStrength();
    }
}
