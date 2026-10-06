package session7.classwork;
class AttendanceSheet{
    private int present=0;
    private String[] name={"Ana", "Ben","Chen"};
    private boolean[] ispresent=new boolean[name.length];
    void markPresent(String student){
        for(int i=0;i<name.length;i++){
            if(name[i].equals(student)){
                if(ispresent[i]==false){
                    ispresent[i]=true;
                    present++;
                }
            }
        }
    }
    void isPresent(String student){
        for(int i=0;i<name.length;i++){
            if(name[i].equals(student))
                System.out.println(ispresent[i]);
        }
    }
    void getPresentCount(){
        System.out.println(present);
    }

}
public class TheAttendanceSheet {
    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet();
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");
        sheet.isPresent("Chen");
        sheet.getPresentCount();
        sheet.isPresent("Ben");
    }
}
