package session7.classwork;
class Locker{
    final private int locker;
    private String combinationcode;
    Locker(int locker,String combinationcode){
        this.locker=locker;
        this.combinationcode=combinationcode;
    }
    void changeCode(String oldcode,String newcode){
        if(oldcode.equals(combinationcode)){
            combinationcode=newcode;
            System.out.println("Success");
        }
        else
            System.out.println("Rejected");
    }
}
public class TheLockerCode{
    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");
        l.changeCode("1234", "5678");
        l.changeCode("0000", "9999");
    }
}