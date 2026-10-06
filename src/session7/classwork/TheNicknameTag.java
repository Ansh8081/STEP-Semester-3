package session7.classwork;
final class NameTag{
    final private String firstname;
    final private String lastname;
    NameTag(String fullname){
        StringBuilder sb=new StringBuilder(fullname);
        firstname=sb.substring(0,fullname.indexOf(' ')).toString();
        lastname=sb.substring(fullname.indexOf(' ')+1).toString();
    }
    void getNickname(){
        System.out.println(firstname+" "+lastname.charAt(0));
    }
}
public class TheNicknameTag {
    public static void main(String[] args) {
        NameTag tag = new NameTag("Maria Gomez");
        tag.getNickname();
    }
}
