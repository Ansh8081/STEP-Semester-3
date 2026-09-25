package session6.classwork;
class Course{
    String code;
    String title;
    int credits;
    int labCredits;
    Course(String code, String title, int credits, int labCredits){
        this.code=code;
        this.title=title;
        this.credits=credits;
        this.labCredits=labCredits;
    }
    Course(String code, String title, int credits){
        this.code=code;
        this.title=title;
        this.credits=credits;
        this.labCredits=0;
    }
    int totalCredits(){
        return credits + labCredits;
    }
    void display(){
        System.out.println(code+" total credits: "+totalCredits());
    }
}
public class CourseCreditManagement {
    public static void main(String[] args) {
        Course dsaj=new Course("21CSC201J","Data Structures", 4);
        Course dsal=new Course("21CSC205L","DSA Lab",3,1);
        dsaj.display();;
        dsal.display();;
    }
}
